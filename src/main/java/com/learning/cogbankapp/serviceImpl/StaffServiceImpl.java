package com.learning.cogbankapp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.cogbankapp.model.Staff;
import com.learning.cogbankapp.repository.StaffRepository;
import com.learning.cogbankapp.service.StaffService;

@Service
public class StaffServiceImpl implements StaffService {
	
	@Autowired
	private StaffRepository sr;

	@Override
	public Staff registerStaff(Staff staff) {
		// TODO Auto-generated method stub
		return sr.save(staff);
	}

	@Override
	public Staff updateStaff(Staff staff) {
		// TODO Auto-generated method stub
		Staff s = sr.findById(staff.getId()).orElse(null);
		s.setFirstName(staff.getFirstName());
		s.setLastName(staff.getLastName());
		s.setEmail(staff.getEmail());
		s.setPassword(staff.getPassword());
		return sr.save(s);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
	}

	@Override
	public Staff findStaffById(Integer id) {
		// TODO Auto-generated method stub
		Staff s = sr.findById(id).get();
		return s;
	}

	@Override
	public List<Staff> findAllStaff() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}
	
}
