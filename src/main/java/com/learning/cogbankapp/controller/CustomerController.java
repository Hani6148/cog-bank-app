package com.learning.cogbankapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PostMapping("/register")
	public Customer saving(@RequestBody Customer cus) {
		
		cusService.register(cus);
		return cus;
	}
		

	@PostMapping("/save/valid")
	public CustomerRequest saveValidation(@RequestBody @Valid CustomerRequest cr) {
		
		return cr;
	}
	
	
	
	//Updating data for the user
	@PutMapping("/update")
	public Customer update(@RequestBody Customer c) {
		
		return cusService.update(c);
	}
	
	
	//Customer account deletion-
	@DeleteMapping("/delete/{id}")
	public String accDelete(@PathVariable Integer id) {
		
		cusService.deleteAccById(id);
		
		return "Account with id : " + id + " has successfully been deleted!";
	}
	

}
