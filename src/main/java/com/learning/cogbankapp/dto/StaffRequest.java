package com.learning.cogbankapp.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class StaffRequest {
	@NotNull(message = "First Name field is required.")
	private String firstName;
	@NotNull(message = "Last Name field is required.")
	private String lastName;
	@Email(message = "Invalid email address")
	@NotNull
	private String email;
	@Size(min = 6, message = "Password is too short.")
	private String password;
}
