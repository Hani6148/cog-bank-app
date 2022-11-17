package com.learning.cogbankapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/staff")
public class StaffController {
	@PostMapping("/authenticate")
	public void authenticateStaff() {
		
	}
}
