package com.example;

public class User implements Comparable<User>{
	private String name;
	private String mobileNumber;
	private String username;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String mobileNumber, String username, String password) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Name :" + name + "\nmobileNumber :" + mobileNumber + "\nusername :" + username + "\npassword :"
				+ password;
	}
	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return 0	;
	}
	
}

