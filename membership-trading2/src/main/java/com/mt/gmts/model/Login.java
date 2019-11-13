package com.mt.gmts.model;

public class Login {
	
	private String id;//아이디
	private String password;//패스워드
	
	
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
	
	
	@Override
	public String toString() {
		return "Login [id=" + id + ", password=" + password + "]";
	}
	
	
}