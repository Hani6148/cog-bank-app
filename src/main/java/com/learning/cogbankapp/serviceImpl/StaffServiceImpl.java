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

	/*public Employee update(Employee e) {
		Employee e1 = empRepository.findById(e.getId()).orElse(null);
		e1.setEmail(e.getEmail());
		e1.setName(e.getName());
		e1.setMobileno(e.getMobileno());
		e1.setSalary(e.getSalary());

		return empRepository.save(e1);
	}*/
	
	
	@Override
	public Staff updateStaff(Staff staff) {
		// TODO Auto-generated method stub
		Staff staff1 = sr.findById(staff.getId()).orElse(null);
		staff1.setEmail(staff.getEmail());
		staff1.setFirstName(staff.getFirstName());
		staff1.setLastName(staff.getLastName());
		staff1.setPassword(staff.getPassword());

		return sr.save(staff1);
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
