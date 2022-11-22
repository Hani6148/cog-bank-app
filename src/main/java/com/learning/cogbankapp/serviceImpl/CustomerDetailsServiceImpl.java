package com.learning.cogbankapp.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.learning.cogbankapp.model.Customer;
import com.learning.cogbankapp.repository.CustomerRepository;

public class CustomerDetailsServiceImpl implements UserDetailsService {
	@Autowired
	CustomerRepository cusRepo;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		 Customer customer= cusRepo.findByEmail(email);
		 System.out.println(email);
		 if(customer==null) {
			 System.out.println("should throw custom 4545 here");
			 System.out.println("log user not found");
		 }
		 else {
			 System.out.println("log user found");
		 }
		List auths = new ArrayList<>();
		auths.add(new SimpleGrantedAuthority("customer"));
		return new User(customer.getEmail(),customer.getPassword(),auths);
	}
}
