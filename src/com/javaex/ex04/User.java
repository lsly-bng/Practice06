package com.javaex.ex04;

public class User {
	
	//field
	protected String id;
	protected String password;
	protected String name;
	
	//constructor
	public User() {
	}
	
	public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}

	//method - g/s
	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	//method - general 
	public void showInfo() {
		
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", name=" + name + "]";
	}
	
	
}
