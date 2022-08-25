package com.ofss.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ofss.main.domain.Circle;
import com.ofss.main.domain.Triangle;
import com.ofss.main.service.ShapeService;

public class SpringAOPMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		ShapeService shapeService = applicationContext.getBean("shapeService", ShapeService.class);

		Circle circle = shapeService.getCircle();
		System.out.println(circle.getName());

		System.out.println();

		Triangle triangle = shapeService.getTriangle();
		System.out.println(triangle.getName());
	}
}
