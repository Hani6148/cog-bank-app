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
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
	}

	@Override
	public Optional<Staff> findStaffById(Integer id) {
		// TODO Auto-generated method stub
		return sr.findById(id);
	}

	@Override
	public List<Staff> findAllStaff() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}
	
}
