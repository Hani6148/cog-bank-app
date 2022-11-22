package com.learning.cogbankapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.learning.cogbankapp.serviceImpl.CustomerDetailsServiceImpl;

@SpringBootApplication
public class CogBankAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CogBankAppApplication.class, args);
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public CustomerDetailsServiceImpl CustomerDetailsService() {
		return new CustomerDetailsServiceImpl();
	}
	

}
