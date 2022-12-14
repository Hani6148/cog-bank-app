package com.learning.cogbankapp.filter;

import java.io.IOException;
import java.util.Date;
import java.util.stream.Collectors;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

public class CustomAuthFilter extends UsernamePasswordAuthenticationFilter{

	private final AuthenticationManager authenticationManager;
	public CustomAuthFilter (AuthenticationManager authenticationManager) {
		this.authenticationManager= authenticationManager;
	}
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(email,password);
		return authenticationManager.authenticate(authenticationToken);
		
	}
	


	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		// TODO Auto-generated method stub
		User customer = (User) authResult.getPrincipal();
		Algorithm algo = Algorithm.HMAC256("secret".getBytes());
		String access_token = JWT.create()
				.withSubject(customer.getUsername())
				.withExpiresAt(new Date(System.currentTimeMillis()+10*60*1000))
				.withIssuer(request.getRequestURL().toString())
				.withClaim("roles",customer.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
				.sign(algo);
		
		String refresh_token = JWT.create()
				.withSubject(customer.getUsername())
				.withExpiresAt(new Date(System.currentTimeMillis()+30*60*1000))
				.withIssuer(request.getRequestURL().toString())
				.withClaim("roles",customer.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
				.sign(algo);
		
		response.setHeader("access_token", access_token);
		response.setHeader("refresh_token", refresh_token);
		
	}

}
