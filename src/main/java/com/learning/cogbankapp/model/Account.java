package com.learning.cogbankapp.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import antlr.collections.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "account_table")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Account {
	@Id
	@GeneratedValue
	private Integer accountId;	
	private Integer customerId;
	private Float accountValue;
	private boolean accountActive = false;
	private ArrayList <Transaction> transactions = new ArrayList<>();
	
}