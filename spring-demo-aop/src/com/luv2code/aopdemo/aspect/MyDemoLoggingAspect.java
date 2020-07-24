package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	@Pointcut("execution(public void add*())")
	private void anyAddMethod() {}

	@Before("execution(public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")
	public void beforeAddAccountAdvice() {
		System.out.println("@Before advice on AccountDAO.addAccount()");
	}

	@Before("anyAddMethod()")
	public void beforeAnyAddAdvice() {
		System.out.println("@Before advice on add*()");
	}

}
