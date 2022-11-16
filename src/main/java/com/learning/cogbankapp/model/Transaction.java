package com.learning.cogbankapp.model;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "transaction_table")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Transaction {
	@Id
	@GeneratedValue
	private Integer transactionId;
	@ManyToOne(cascade=CascadeType.ALL)
	private Account sender;
	@ManyToOne(cascade=CascadeType.ALL)

	private Account receiver;
	private Float amount;
	
}
