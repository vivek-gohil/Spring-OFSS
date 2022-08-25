package com.ofss.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ofss.main.pojo.Employee;
import com.ofss.main.repository.EmployeeRepository;

@Component
public class EmployeeService implements EmployeeServiceInterface {

	@Autowired
	EmployeeRepository employeeRepository;

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("setEmployeeRepository() called");
		this.employeeRepository = employeeRepository;
	}

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
