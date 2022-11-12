package com.learning.cogbankapp.serviceValidation;

import java.util.List;
import java.util.Optional;

import com.learning.cogbankapp.dto.StaffRequest;
import com.learning.cogbankapp.model.Staff;

public interface StaffServiceValidation {
	public Staff registerStaff(StaffRequest staff);

	public Staff updateStaff(StaffRequest staff);

	public void deleteById(Integer id);

	public Optional<Staff> findStaffById(Integer id);

	public List<Staff> findAllStaff();
}
