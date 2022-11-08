package com.learning.cogbankapp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.cogbankapp.model.Customer;
import com.learning.cogbankapp.repository.CustomerRepository;
import com.learning.cogbankapp.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository cusRepo;
	

	@Override
	public Customer save(Customer c) {
		// TODO Auto-generated method stub
		return cusRepo.save(c);
	}
}
