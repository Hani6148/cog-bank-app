package com.learning.cogbankapp.service;

import java.util.List;
import java.util.Optional;

import com.learning.cogbankapp.model.Account;
import com.learning.cogbankapp.model.Transaction;

public interface TransactionService {

	public Optional<Transaction> findTransactionById(Integer id);
	public List<Transaction> findAllTransactions();
	public Transaction transfer(Integer senderId, Integer receierId, Float amount);
}
