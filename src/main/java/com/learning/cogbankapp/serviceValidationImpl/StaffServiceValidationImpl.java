package com.learning.cogbankapp.serviceValidationImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.learning.cogbankapp.dto.StaffRequest;
import com.learning.cogbankapp.model.Staff;
import com.learning.cogbankapp.repository.StaffRepository;
import com.learning.cogbankapp.serviceValidation.StaffServiceValidation;

public class StaffServiceValidationImpl implements StaffServiceValidation {

	@Autowired
	StaffRepository sr;

	@Override
	public Staff registerStaff(StaffRequest staff) {
		// TODO Auto-generated method stub
		Staff s = new Staff();
		s.setFirstName(staff.getFirstName());
		s.setLastName(staff.getLastName());
		s.setEmail(staff.getEmail());
		s.setPassword(staff.getPassword());
		return sr.save(s);
	}

	@Override
	public Staff updateStaff(StaffRequest staff) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
	}

	@Override
	public Staff findStaffById(Integer id) {
		// TODO Auto-generated method stub
		return sr.findById(id).get();
	}

	@Override
	public List<Staff> findAllStaff() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

}
