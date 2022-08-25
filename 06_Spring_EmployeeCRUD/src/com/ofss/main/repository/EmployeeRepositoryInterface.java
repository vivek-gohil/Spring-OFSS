package com.ofss.main.repository;

import java.util.List;

import com.ofss.main.pojo.Employee;

public interface EmployeeRepositoryInterface {
	boolean addNewEmployee(Employee employee);

	boolean updateEmployee(Employee employee);

	boolean deleteEmployeeByEmployeeId(int employeeId);

	Employee getEmployeeByEmployeeId(int employeeId);

	List<Employee> getAllEmployees();
}
