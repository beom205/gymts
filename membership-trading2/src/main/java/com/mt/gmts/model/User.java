package com.mt.gmts.model;

import java.sql.Date;

public class User {
	
	private String id;//아이디
	private String password;//패스워드
	private String  email;//이메일
	private String phone;//전화번호
	private String ad_check;//광고수락
//	private Date signup_date;//회원가입날짜
//	private Date signin_date;//로그인날짜
	
	
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
	public String getAd_check() {
		return ad_check;
	}
	public void setAd_check(String ad_check) {
		this.ad_check = ad_check;
	}
//	public Date getSignup_date() {
//		return signup_date;
//	}
//	public void setSignup_date(Date signup_date) {
//		this.signup_date = signup_date;
//	}
//	public Date getSignin_date() {
//		return signin_date;
//	}
//	public void setSignin_date(Date signin_date) {
//		this.signin_date = signin_date;
//	}
//	
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", email=" + email + ", phone=" + phone + "]";
	}
	


}
