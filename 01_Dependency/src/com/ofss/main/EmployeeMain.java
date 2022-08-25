package com.ofss.main;

import com.ofss.main.pojo.Address;
import com.ofss.main.pojo.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		// Create the employee object and call the overloaded constructor
//		Address address = new Address(101, "B12/Nisarga CHS", "M.G. Road", "Mumbai", "400012");
//		Employee employee = new Employee(101, "Vivek Gohil", 1000, address);
//
//		// print the employee object
//		System.out.println(employee);
//
//		Employee employee2 = new Employee();
//		employee2.setEmployeeId(102);
//		employee2.setName("Test");
//		employee2.setSalary(1000);
//		employee2.setHomeAddress(address);
		Address address = new Address();
		Employee employee = new Employee();
		employee.setHomeAddress(address);
		System.out.println(employee);
	}
}
