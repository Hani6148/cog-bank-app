package com.learning.cogbankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.cogbankapp.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>  {

}
