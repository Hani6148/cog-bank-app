package com.learning.cogbankapp.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.learning.cogbankapp.model.Customer;
import com.learning.cogbankapp.model.Staff;
import com.learning.cogbankapp.repository.CustomerRepository;
import com.learning.cogbankapp.service.CustomerService;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service  @RequiredArgsConstructor 
public class CustomerServiceImpl implements CustomerService {
	
	

	@Autowired
	CustomerRepository cusRepo;
	private final PasswordEncoder passwordEncoder;


	@Override
	public Customer register(Customer c) {
		c.setPassword(passwordEncoder.encode(c.getPassword()));
		return cusRepo.save(c);

		
	}


	@Override
	public Customer update(Customer c) {
		Customer temp = cusRepo.findById(c.getId()).orElse(null);

		temp.setFirst_name(c.getFirst_name());
		temp.setLast_name(c.getLast_name());
		temp.setMiddle_name(c.getMiddle_name());
		temp.setMobileNum(c.getMobileNum());
		temp.setPassword(c.getPassword());

		return cusRepo.save(temp);
	}


	@Override
	public void deleteAccById(Integer id) {
	
		cusRepo.deleteById(id);
	}
	
	@Override
	public List<Customer> findAllCustomrs() {
		return cusRepo.findAll();
	}

	
}