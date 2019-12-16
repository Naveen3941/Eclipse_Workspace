package com.example;

public class EmployeeModel {
	private int id;
	private String name;
	private int pincode;
	
	
	public EmployeeModel(int id, String name, int pincode) {
		super();
		this.id = id;
		this.name = name;
		this.pincode = pincode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	

}
