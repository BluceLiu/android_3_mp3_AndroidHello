package com.example.entity;

import java.io.Serializable;

public class User implements Serializable{

	private String userName;
	private String userPwd;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public User(String userName, String userPwd) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
	}
	public User() {
		super();
	}
	
	
}
