package com.baemin.model;

public class User {
	
	private String email;
	private String phone;
	private String id;
	private String password;
	private String nickName;
	private char level;
	
	public User() {
	}

	public User(String email, String phone, String id, String password, String nickName, char level) {
		this.email = email;
		this.phone = phone;
		this.id = id;
		this.password = password;
		this.nickName = nickName;
		this.level = level;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public char getLevel() {
		return level;
	}

	public void setLevel(char level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", phone=" + phone + ", id=" + id + ", password=" + password + ", nickName="
				+ nickName + ", level=" + level + "]";
	}
	
	
	
	
	

	
	
}
