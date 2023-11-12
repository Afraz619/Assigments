package com.afraz.bean;

import java.io.Serializable;

public class UserModel implements Serializable {
	String name;
	String email;
	String password;
	String contact;
	
	
	public UserModel() {
		super();
	}


	public UserModel(String name, String email, String password, String contact) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.contact = contact;
	}


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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	@Override
	public String toString() {
		return "UserModel [name=" + name + ", email=" + email + ", password=" + password + ", contact=" + contact + "]";
	}
	
}
