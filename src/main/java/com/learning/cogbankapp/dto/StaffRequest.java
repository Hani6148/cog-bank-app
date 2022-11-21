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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "StaffRequest [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}

}
