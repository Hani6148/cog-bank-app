package com.learning.cogbankapp.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.learning.cogbankapp.model.Admin;
import com.learning.cogbankapp.model.Customer;
import com.learning.cogbankapp.model.Staff;
import com.learning.cogbankapp.repository.AdminRepository;
import com.learning.cogbankapp.repository.CustomerRepository;
import com.learning.cogbankapp.repository.StaffRepository;

public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	CustomerRepository cusRepo;
	@Autowired
	StaffRepository staffRepo;
	@Autowired
	AdminRepository adminRepo;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		 Customer customer= cusRepo.findByEmail(email);
		 Staff staff= staffRepo.findByEmail(email);
		 Admin admin= adminRepo.findByEmail(email);
		 System.out.println(email);
		 if(customer!=null) {
			    List auths = new ArrayList<>();
				auths.add(new SimpleGrantedAuthority("customer"));
				return new User(customer.getEmail(),customer.getPassword(),auths);
		 }
		 else if(staff!=null) {
			    List auths = new ArrayList<>();
				auths.add(new SimpleGrantedAuthority("staff"));
				return new User(staff.getEmail(),staff.getPassword(),auths);		 
		}
		 else {
			    List auths = new ArrayList<>();
				auths.add(new SimpleGrantedAuthority("admin"));
				return new User(admin.getEmail(),admin.getPassword(),auths);	
			 
		 }
		
	}
}
