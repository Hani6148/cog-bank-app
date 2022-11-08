package com.learning.cogbankapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "customer_banking")
@Setter
@Getter
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@ToString
public class Customer {
	
	@Id
	@GeneratedValue
	private Integer id;				//ID should be the primary key, and should be matching with the customerID of the banking
	private String last_name;
	private String first_name;
	private String middle_name;
	private String mobileNum;
	private String password;

}
