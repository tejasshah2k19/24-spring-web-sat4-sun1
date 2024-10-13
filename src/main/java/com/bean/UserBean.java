package com.bean;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class UserBean {

	@Pattern(regexp = "[a-zA-Z]+",message = "Please Enter Valid FirstName")
	@NotBlank(message = "Please Enter FirstName")
//	@Max(value = 20,message = "FirstName can not be more than 20 characters")
	@Length(max = 20,message = "FirstName can not be more than 20 characters")

	private String firstName;

	@NotBlank(message = "Please Enter LastName")
	private String lastName;

	@NotBlank(message = "Please Enter Email")
	private String email;

	@NotBlank
//	@Min(value = 8,message = "Password must be greater or equals in 8 characters")
	@Length(min = 8,message = "Password must be greater or equals in 8 characters")
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

}
