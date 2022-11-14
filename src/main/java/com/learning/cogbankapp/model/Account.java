package com.learning.cogbankapp.model;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@ManyToOne(cascade=CascadeType.ALL)
	private Integer customerId;
	private Float accountValue;
	private boolean accountActive = false;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="senderID",fetch=FetchType.EAGER)
	private ArrayList <Transaction> sendTransactions = new ArrayList<>();
	@OneToMany(cascade=CascadeType.ALL, mappedBy="receiverID",fetch=FetchType.EAGER)
	private ArrayList <Transaction> receiveTransactions = new ArrayList<>();
}
