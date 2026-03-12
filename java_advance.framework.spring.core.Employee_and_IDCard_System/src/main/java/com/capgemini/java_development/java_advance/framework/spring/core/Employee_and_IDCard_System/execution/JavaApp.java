package com.capgemini.java_development.java_advance.framework.spring.core.Employee_and_IDCard_System.execution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.java_development.java_advance.framework.spring.core.Employee_and_IDCard_System.entity.Employee;

public class JavaApp {
	public static void execution() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee emp = context.getBean("employee", Employee.class);

		System.out.println("Employee added successfully");

		System.out.println("ID: " + emp.getId());
		System.out.println("Name: " + emp.getName());
		System.out.println("Department: " + emp.getDepartment());

		System.out.println("ID Card:");
		System.out.println("  Card Number: " + emp.getIdCard().getCardNumber());
		System.out.println("  Issue Date: " + emp.getIdCard().getIssueDate());
	}
}
