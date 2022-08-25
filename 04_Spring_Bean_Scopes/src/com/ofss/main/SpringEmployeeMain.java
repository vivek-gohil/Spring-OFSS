package com.ofss.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ofss.main.pojo.Address;

public class SpringEmployeeMain {
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println("1. Creating ApplicationContext");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("1. ApplicationContext Is Created!!");

		System.out.println();

		System.out.println("2. Injecting Address Object Start");
		Address address = applicationContext.getBean("address", Address.class);
		System.out.println("2. Injecting Address Object end");
		System.out.println(address);

		System.out.println();

		System.out.println("3. Injecting One More Address Object Start");
		Address address2 = applicationContext.getBean("address", Address.class);
		System.out.println("3. Injecting One More Address Object end");
		System.out.println(address2);

		System.out.println("main end");
	}
}
