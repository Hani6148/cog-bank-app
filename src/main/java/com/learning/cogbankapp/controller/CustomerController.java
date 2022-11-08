package com.learning.cogbankapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.cogbankapp.dto.CustomerRequest;
import com.learning.cogbankapp.model.Customer;
import com.learning.cogbankapp.service.CustomerService;

@RestController
@RequestMapping("/bankcstmr")
public class CustomerController {
	
	@Autowired
	CustomerService cusService;
	
	
	//Saving methods
	
	@PostMapping("/save")
	public Customer saving(@RequestBody Customer cus) {
		
		cusService.save(cus);
		return cus;
	}
	
	@PostMapping("/save/valid")
	public CustomerRequest saveValidation(@RequestBody @Valid CustomerRequest cr) {
		
		return cr;
	}

}
