package com.learning.cogbankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.cogbankapp.model.Customer;
import com.learning.cogbankapp.model.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {

	  Staff findByEmail(String email);

}
