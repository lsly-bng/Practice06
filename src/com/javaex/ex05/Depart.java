package com.javaex.ex05;

public class Depart extends Employee {

	//field
	private String department;

	//constructor
	public Depart() {
		super();
	}

	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	//method - g/s
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	//method - general 
	public void showInformation() {
		System.out.println("이름:" + super.getName() + " 연봉:" + super.getSalary()+" 부서:"+department);
	}
	

}
