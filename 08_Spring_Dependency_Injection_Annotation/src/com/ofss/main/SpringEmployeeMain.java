package com.ofss.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ofss.main.pojo.Employee;

public class SpringEmployeeMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		Employee employee = applicationContext.getBean("employee", Employee.class);

		System.out.println(employee);
	}
}
