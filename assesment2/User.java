package com.model;


public class User {
	protected int id;
	protected String fname;
	protected String lname;
	protected String email;
	protected String mobile;
	protected String address;
	protected String gender;

	public User() {
	}
	
	public User(String fname,String lname,String email,String mobile,String address,String gender) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.gender = gender;
	}

	public User(int id, String fname,String lname,String email,String mobile,String address,String gender) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fname;
	}
	public void setName(String fname) {
		this.fname =fname;
	}
	public String getlName() {
		return lname;
	}
	public void setlName(String lname) {
		this.fname =lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAdress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}