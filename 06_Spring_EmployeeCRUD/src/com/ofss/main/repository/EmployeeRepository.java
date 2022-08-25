package com.ofss.main.repository;

import java.util.ArrayList;
import java.util.List;

import com.ofss.main.pojo.Employee;

public class EmployeeRepository implements EmployeeRepositoryInterface {

	private List<Employee> employeeList = new ArrayList<>();

	public boolean addNewEmployee(Employee employee) {
		System.out.println("addNewEmployee() of EmployeeRepository");
		return employeeList.add(employee);
	}

	public boolean updateEmployee(Employee employee) {
		return false;
	}

	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		return false;
	}

	public Employee getEmployeeByEmployeeId(int employeeId) {
		return null;
	}

	public List<Employee> getAllEmployees() {
		System.out.println("getAllEmployees() of EmployeeRepository");
		return employeeList;
	}

}
