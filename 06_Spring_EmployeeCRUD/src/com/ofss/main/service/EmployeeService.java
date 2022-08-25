package com.ofss.main.service;

import java.util.List;

import com.ofss.main.pojo.Employee;
import com.ofss.main.repository.EmployeeRepository;

public class EmployeeService implements EmployeeServiceInterface {

	EmployeeRepository employeeRepository = new EmployeeRepository();

	@Override
	public boolean addNewEmployee(Employee employee) {
		System.out.println("addNewEmployee() Of EmployeeService");
		return employeeRepository.addNewEmployee(employee);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		return false;
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		return false;
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.getAllEmployees();
	}

}
