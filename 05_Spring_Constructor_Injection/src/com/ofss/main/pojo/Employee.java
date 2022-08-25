package com.ofss.main.pojo;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;
	private Address homeAddress;

	public Employee() {
		System.out.println("Employee object is created");
	}

	public Employee(int employeeId, String name, double salary, Address homeAddress) {
		System.out.println("Overloaded Constructor Of Employee");
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.homeAddress = homeAddress;
	}

	public int getEmployeeId() {
		System.out.println("getEmployeeId() Called");
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		System.out.println("setEmployeeId() Called");
		this.employeeId = employeeId;
	}

	public String getName() {
		System.out.println("getName() Called");
		return name;
	}

	public void setName(String name) {
		System.out.println("setName() Called");
		this.name = name;
	}

	public double getSalary() {
		System.out.println("getSalary() Called");
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("setSalary() Called");
		this.salary = salary;
	}

	public Address getHomeAddress() {
		System.out.println("getHomeAddress() Called");
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		System.out.println("setHomeAddress() Called");
		this.homeAddress = homeAddress;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", homeAddress="
				+ homeAddress + "]";
	}

}
