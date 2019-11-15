package com.mt.gmts.model;

import java.text.SimpleDateFormat;

public class board {
	
	SimpleDateFormat formatter04 = new SimpleDateFormat("yy/MM/dd");
	java.util.Date time = new java.util.Date();
	String stime = formatter04.format(time);
	
	
	private int bno;
	private String title;
	private String context;
	private String reg_data = stime;
	private int view_count = 0;
	
	private String img_path ="asdf";
	private char choice = 1;
	private int price = 0;
	
	
	public String getStime() {
		return stime;
	}
	public void setStime(String stime) {
		this.stime = stime;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
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
	public String getImg_path() {
		return img_path;
	}
	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}
	public char getChoice() {
		return choice;
	}
	public void setChoice(char choice) {
		this.choice = choice;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
