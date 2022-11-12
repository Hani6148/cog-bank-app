package com.learning.cogbankapp.serviceValidation;

import java.util.List;
import java.util.Optional;

import com.learning.cogbankapp.model.Staff;

public interface StaffServiceValidation {
	public Staff registerStaff(Staff staff);

	public Staff updateStaff(Staff staff);

	public void deleteById(Integer id);

	public Optional<Staff> findStaffById(Integer id);

	public List<Staff> findAllStaff();
}
