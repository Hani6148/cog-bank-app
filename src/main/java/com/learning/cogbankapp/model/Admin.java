package com.learning.cogbankapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "admin_banking")
@Setter
@Getter
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@ToString
public class Admin {

	@Id
	@GeneratedValue
	Integer id;
	@NotNull(message ="username can't be null")
	String username;
	String email;
	String password;
	
}
