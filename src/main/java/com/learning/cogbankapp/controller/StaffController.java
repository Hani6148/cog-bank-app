package com.learning.cogbankapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.cogbankapp.model.Account;
import com.learning.cogbankapp.model.Customer;
import com.learning.cogbankapp.model.Transaction;

@RestController
@RequestMapping("/api/staff")
public class StaffController {
	@PostMapping("/authenticate")
	public void authenticateStaff() {	// Should return a JWT Token. Implement after JWT utility is finished.
		
	}
	
	@GetMapping("/account/{accountNo}")
	public void getAccount(@PathVariable Integer accountNo) {
		
	}
	
	@GetMapping("/beneficiary")
	public List<?> getAllBeneficiaries() {
		return null;
	}
	
	@PutMapping("/beneficiary")
	public void approveBeneficiary(@RequestBody Transaction transaction) {
		
	}
	
	@GetMapping("/accounts/approve")
	public List<Account> accountsToBeApproved() {
		return null;
	}
	
	@PutMapping("/accounts/approve")
	public void approveAccounts(@RequestBody List<Account> accounts) {
		
	}
	
	@GetMapping("/customer")
	public List<Customer> getAllCustomers() {
		return null;
	}
	
	@PutMapping("/customer")
	public void enableOrDisable() {
		
	}
	
	@GetMapping("/customer/{customerId}")
	public Customer getCustomerById(@PathVariable Integer id) {
		return null;
	}
	
	@PutMapping("/transfer")
	public void transferAmount() {
		
	}
	
	
}
