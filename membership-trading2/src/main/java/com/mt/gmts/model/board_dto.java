package com.mt.gmts.model;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class board_dto {
	SimpleDateFormat formatter04 = new SimpleDateFormat("yy/MM/dd");
	java.util.Date time = new java.util.Date();
	String stime = formatter04.format(time);
	
	
	
	private String title = "null";
	private String context = "null";
	private String reg_data = stime;
	private int view_count = -1;
	private String board_img_path = "null";
	private int choice = -1;
	private int price = 0;
	
	private String user_id = "null";
	private String user_email = "null";
	private int user_phone = -1;
	private String user_img_path = "null";
	
	private String gym_name = "null";
	private int gym_phone = -1;
	private String address = "null";
	private String homepage = "null";
	
	public int bno = 0;
	
	
	public int getBno() {
		return bno;
	}


	public void setBno(int bno) {
		this.bno = bno;
	}


	@Override
	public String toString() {
		return "board_dto [title=" + title + ", context=" + context + ", reg_data=" + reg_data + ", view_count="
				+ view_count + ", board_img_path=" + board_img_path + ", choice=" + choice + ", price=" + price
				+ ", user_id=" + user_id + ", user_email=" + user_email + ", user_phone=" + user_phone
				+ ", user_img_path=" + user_img_path + ", gym_name=" + gym_name + ", gym_phone=" + gym_phone
				+ ", address=" + address + ", homepage=" + homepage + "]";
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getReg_data() {
		return reg_data;
	}
	public void setReg_data(String reg_data) {
		this.reg_data = reg_data;
	}
	public int getView_count() {
		return view_count;
	}
	public void setView_count(int view_count) {
		this.view_count = view_count;
	}
	public String getBoard_img_path() {
		return board_img_path;
	}
	public void setBoard_img_path(String board_img_path) {
		this.board_img_path = board_img_path;
	}
	public int getChoice() {
		return choice;
	}
	public void setChoice(int choice) {
		this.choice = choice;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public int getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(int user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_img_path() {
		return user_img_path;
	}
	public void setUser_img_path(String user_img_path) {
		this.user_img_path = user_img_path;
	}
	public String getGym_name() {
		return gym_name;
	}
	public void setGym_name(String gym_name) {
		this.gym_name = gym_name;
	}
	public int getGym_phone() {
		return gym_phone;
	}
	public void setGym_phone(int gym_phone) {
		this.gym_phone = gym_phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	
	
	
	
	
}
