package com.learning.cogbankapp.service;


import java.util.Optional;

import com.learning.cogbankapp.model.Customer;

public interface CustomerService {
	
	public Customer register(Customer c);
	
	public Customer update(Customer c);
	
	//public Optional<Customer> findById (Integer id); //This method is for admin and staff
	
	public void deleteAccById(Integer id);
}

