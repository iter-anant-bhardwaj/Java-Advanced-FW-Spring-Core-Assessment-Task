package com.capgemini.java_development.java_advanced.framework.spring.core.Employee_and_Department_System.execution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.java_development.java_advanced.framework.spring.core.Employee_and_Department_System.entity.Employee;

public class JavaApp {
	public static void execution() {
		ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee emp = context.getBean("employee", Employee.class);

        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());

        System.out.println("\nDepartment:");
        System.out.println("  Name: " + emp.getDepartment().getName());
        System.out.println("  Location: " + emp.getDepartment().getLocation());
	}
}
