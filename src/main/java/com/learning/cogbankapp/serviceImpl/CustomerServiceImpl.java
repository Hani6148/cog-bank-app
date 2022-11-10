package com.learning.cogbankapp.serviceImpl;

import java.util.Optional;

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
	public Customer register(Customer c) {

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
	
}
