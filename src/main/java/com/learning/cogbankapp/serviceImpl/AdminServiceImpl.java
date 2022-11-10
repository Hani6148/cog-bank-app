package com.learning.cogbankapp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.cogbankapp.model.Admin;
import com.learning.cogbankapp.repository.AdminRepository;
import com.learning.cogbankapp.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepository;
	
	@Override
	public List<Admin> findAllStaffs() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}

}
