package com.learning.cogbankapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.cogbankapp.dto.StaffRequest;
import com.learning.cogbankapp.serviceValidation.StaffServiceValidation;

@RestController
@RequestMapping("/api/staff")
public class StaffController {
	
	@Autowired
	StaffServiceValidation staffServiceValidation;
	
	@PostMapping("/authenticate")
	public void authenticate(@Valid @RequestBody StaffRequest staffRequest) {
		
	}
	
}
