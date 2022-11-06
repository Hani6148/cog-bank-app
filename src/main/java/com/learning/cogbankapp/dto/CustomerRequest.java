package com.learning.cogbankapp.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CustomerRequest {
	
	@NotNull(message="Please enter your First Name.")
	private String last_name;
	
	@NotNull(message="Please enter your Last Name")
	private String first_name;
	
	private String middle_name;		//Possible to have no middle name
	
	@Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
	private String mobileNum;
	
	
	@Pattern(regexp = "^(?=.*[0-9])"
            + "(?=.*[a-z])(?=.*[A-Z])"
            + "(?=.*[@#$%^&+=])"
            + "(?=\\S+$).{8,20}$",message = "Your passowrd must constain at least one of these characters")
	private String password;

}
