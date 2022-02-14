package com.virtusa.beans;


	//import javax.persistence.Entity;
	//import javax.persistence.Id;

	//@Entity
	public class Admin {
		//@Id
	
	private int UserId;
	private String UserType;
	private String UserName;
	private String Password;
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserType() {
		return UserType;
	}
	public void setUserType(String userType) {
		UserType = userType;
	}
	public String getUserName() {
		return UserName;
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
	
	}