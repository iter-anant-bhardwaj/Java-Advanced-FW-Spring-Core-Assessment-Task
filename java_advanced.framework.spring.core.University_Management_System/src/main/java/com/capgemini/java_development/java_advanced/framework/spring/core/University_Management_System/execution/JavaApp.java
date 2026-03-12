package com.capgemini.java_development.java_advanced.framework.spring.core.University_Management_System.execution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.java_development.java_advanced.framework.spring.core.University_Management_System.entity.Student;

public class JavaApp {
	public static void execution() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Student student = context.getBean("student", Student.class);

		System.out.println("Student ID: " + student.getId());
		System.out.println("Name: " + student.getName());

		System.out.println("\nProfile:");
		System.out.println("  Email: " + student.getProfile().getEmail());
		System.out.println("  Phone: " + student.getProfile().getPhone());

		System.out.println("\nDepartment:");
		System.out.println("  Name: " + student.getDepartment().getName());

		System.out.println("\nCourses Enrolled:");

		student.getCourses().forEach(c -> System.out.println("  " + c.getCourseName() + " (" + c.getCredits() + " Credits)"));
	}
}
