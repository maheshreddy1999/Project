package com.virtusa.beans;

	//import javax.persistence.Entity;
	//import javax.persistence.Id;

	//@Entity
	public class Signup {
		//@Id
		
		private String FullName;
		private String Email;
	private String UserName;
	private String Password;
	private String Confirm_Password;
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getUserName() {
		return UserName;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getConfirm_Password() {
		return Confirm_Password;
	}
	public void setConfirm_Password(String confirm_Password) {
		Confirm_Password = confirm_Password;
	}
	
	
	}