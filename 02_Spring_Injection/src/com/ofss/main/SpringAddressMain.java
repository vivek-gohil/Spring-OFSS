package com.ofss.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ofss.main.pojo.Address;

public class SpringAddressMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		Address address = applicationContext.getBean("address", Address.class);

		System.out.println(address);

	}

}
