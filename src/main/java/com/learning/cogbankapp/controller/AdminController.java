package com.learning.cogbankapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.cogbankapp.model.Admin;
import com.learning.cogbankapp.service.AdminService;

@CrossOrigin(origins ="*", maxAge=3600)
@RestController
@RequestMapping("/api/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@PostMapping("/authenticate")
	public void authenticate() {
		
	}
	
	@PostMapping("/staff")
	public void createStaff() {
		
	}
	
	@GetMapping("/staff")
	public List<Admin> getAllStaffs() {
		System.out.println(adminService.findAllStaffs());
		return adminService.findAllStaffs();
	}
	
	@PutMapping("/staff")
	public void enableStaff() {
		
	}

}
