package com.ofss.main.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	// @Before("execution(public String getName())")
	// @Before("execution(public String com.ofss.main.domain.Circle.getName())")
	@Before("allGetMethods()")
	public void loggingAdvice() {
		System.out.println("Advice run:: get() called");
	}

	@Before("allGetMethods()")
	public void secondLoggingAdvice() {
		System.out.println("Second Advice Executed");
	}

	@Pointcut("execution(public String get*())")
	public void allGetMethods() {
		// its a dummy method
	}

}
