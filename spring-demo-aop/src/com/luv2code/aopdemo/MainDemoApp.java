package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.StudentDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO accountDao = ctx.getBean("accountDAO", AccountDAO.class);
		StudentDAO studentDao = ctx.getBean("studentDAO", StudentDAO.class);
		
		accountDao.addAccount();
		studentDao.addAccount();
		
		ctx.close();

	}

}
