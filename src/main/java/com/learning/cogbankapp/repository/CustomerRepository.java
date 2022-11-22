package com.learning.cogbankapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.cogbankapp.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	  Customer findByEmail(String email);

}
