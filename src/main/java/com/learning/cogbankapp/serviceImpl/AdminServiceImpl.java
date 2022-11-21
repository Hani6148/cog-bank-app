package com.learning.cogbankapp.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.cogbankapp.model.Admin;
import com.learning.cogbankapp.model.Staff;
import com.learning.cogbankapp.repository.AdminRepository;
import com.learning.cogbankapp.repository.StaffRepository;
import com.learning.cogbankapp.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	StaffRepository staffRepository;
	
	@Override
	public List<Staff> findAllStaffs() {
		// TODO Auto-generated method stub
		return staffRepository.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		staffRepository.deleteById(id);
	}
	
	

}
