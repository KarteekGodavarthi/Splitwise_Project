package com.example.zuul.netflixzuulapigateway.bean;

public class UserDetails {
	private String userName;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDetails [userName=" + userName + ", password=" + password + "]";
	}
	public UserDetails(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
