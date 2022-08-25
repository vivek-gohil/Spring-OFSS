package com.ofss.main.domain;

import org.springframework.stereotype.Component;

@Component
public class Circle {
	private String name = "My Circle";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
