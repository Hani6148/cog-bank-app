package com.learning.cogbankapp.service;

import java.util.List;

import com.learning.cogbankapp.model.Staff;

public interface StaffService {
	public Staff registerStaff(Staff staff);
	public Staff updateStaff(Staff staff);
	public void deleteById(Integer id);
	public Staff findStaffById(Integer id);
	public List<Staff> findAllStaff();
}
