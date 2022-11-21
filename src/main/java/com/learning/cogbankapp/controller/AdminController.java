package com.learning.cogbankapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.cogbankapp.model.Admin;
import com.learning.cogbankapp.model.Staff;
import com.learning.cogbankapp.service.AdminService;
import com.learning.cogbankapp.service.StaffService;

@CrossOrigin(origins ="*", maxAge=3600)
@RestController
@RequestMapping("/api/admin")
public class AdminController {

	@Autowired
	StaffService staffService;
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/authenticate")
	public void authenticate() {
		
	}
	
	@PostMapping("/staff")
	@ResponseBody
	public String createStaff(@RequestBody Staff staff) {
		  /*staffFullName: String, 
		  staffUserName: String, 
		  staffPassword: String */
		  /*staff.getFirstName();
		  staff.getLastName();
		  staff.getPassword();*/
		
		staffService.registerStaff(staff);
		return "Staff registered";
	}
	
	@GetMapping("/staff")
	public List<Staff> getAllStaffs() {
		System.out.println(staffService.findAllStaff());
		return staffService.findAllStaff();
	}
	
	@PutMapping("/staff")
	public String updateStaff(@RequestBody Staff staff) {
		staffService.updateStaff(staff);
		return "Staff Updated";
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		staffService.deleteById(id);
		return "Staff deleted";
	}

}
