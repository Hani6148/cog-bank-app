package com.learning.cogbankapp.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.learning.cogbankapp.filter.AuthFilter;
import com.learning.cogbankapp.filter.CustomAuthFilter;
import com.learning.cogbankapp.model.Customer;
import com.learning.cogbankapp.serviceImpl.CustomerDetailsServiceImpl;

import lombok.RequiredArgsConstructor;

@Configuration @EnableWebSecurity @RequiredArgsConstructor
public class CustomerSecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
	private final CustomerDetailsServiceImpl customerUserDetails;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
		// TODO Auto-generated method stub
		auth.userDetailsService(customerUserDetails).passwordEncoder(bCryptPasswordEncoder);
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		CustomAuthFilter customAuthFilter= new CustomAuthFilter(authenticationManagerBean());
		customAuthFilter.setFilterProcessesUrl("/customer/login");
		http.csrf().disable();
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		http.authorizeHttpRequests().antMatchers("/customer/login").permitAll();
		http.authorizeHttpRequests().antMatchers("/bankcstmr/save").permitAll();

		http.authorizeHttpRequests().antMatchers("/bankcstmr/**").hasAnyAuthority("customer");
	    http.authorizeHttpRequests().anyRequest().authenticated();
		http.addFilter(customAuthFilter);
		http.addFilterBefore(new AuthFilter(), UsernamePasswordAuthenticationFilter.class);
	}

	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
	
	

	
}

