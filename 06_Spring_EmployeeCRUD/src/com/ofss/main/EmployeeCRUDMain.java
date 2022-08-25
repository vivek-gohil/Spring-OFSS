package com.ofss.main;

import com.ofss.main.pojo.Employee;
import com.ofss.main.service.EmployeeService;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();

		Employee employee = new Employee(101, "Vivek", 1000);

		employeeService.addNewEmployee(employee);

	}

}
