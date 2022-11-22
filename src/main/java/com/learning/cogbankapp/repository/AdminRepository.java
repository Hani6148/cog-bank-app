package com.learning.cogbankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.cogbankapp.model.Admin;
import com.learning.cogbankapp.model.Customer;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{
	
	Admin findByEmail(String email);

}
