package com.jspiders.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "user_hdr")
public class UserDTO {
	@Id
/*	@GenericGenerator(name = "incr", strategy = "increment")
	@GeneratedValue(generator = "incr")*/
	private String user_id;
	private String fname;
	private String lname;
	@Id
	private String email;
	private long mobile;
	private String address;
	private String password;
	private boolean is_active;
	private String user_type;

	/*public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}*/



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDTO [user_id=" + user_id + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", mobile=" + mobile + ", address=" + address + ", password=" + password + ", is_active=" + is_active
				+ ", user_type=" + user_type + "]";
	}



}
