package com.learning.cogbankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.cogbankapp.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
