package com.learning.cogbankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.cogbankapp.model.Account;


public interface AccountRepository extends JpaRepository<Account, Integer> {

}
