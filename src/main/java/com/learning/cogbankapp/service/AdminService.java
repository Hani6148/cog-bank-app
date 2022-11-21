package com.learning.cogbankapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learning.cogbankapp.model.Admin;
import com.learning.cogbankapp.model.Staff;

public interface AdminService {


	public List<Staff> findAllStaffs();

	public void deleteById(Integer id);

}
