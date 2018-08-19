package com.jspiders.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "user_details_hdr")
public class UserDTO {
	/*@Id
	@GenericGenerator(name = "incr", strategy = "increment")
	@GeneratedValue(generator = "incr")
	private int uid;*/
	private String name;
	@Id
	private String email;
	private long phone;
	private String address;
	private String password;

	/*public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
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
		return "UserDTO [name=" + name + ", email=" + email + ", phone=" + phone + ", address="
				+ address + ", password=" + password + "]";
	}

}
