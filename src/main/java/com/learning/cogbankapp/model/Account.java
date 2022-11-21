package com.learning.cogbankapp.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


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
	@ManyToOne(cascade=CascadeType.ALL)
	private Customer customer;
	private Float accountValue;
	private boolean accountActive = false;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="sender",fetch=FetchType.EAGER)
	private Set <Transaction> sendTransactions = new HashSet<>();
	@OneToMany(cascade=CascadeType.ALL, mappedBy="receiver",fetch=FetchType.EAGER)
	private Set <Transaction> receiveTransactions = new HashSet<>();
	
}
