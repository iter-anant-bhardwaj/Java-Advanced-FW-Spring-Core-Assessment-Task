package com.capgemini.java_development.java_advance.framework.spring.core.School_and_Students_System.execution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.java_development.java_advance.framework.spring.core.School_and_Students_System.entity.School;

public class JavaApp {
	public static void execution() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		School school = context.getBean("school", School.class);

		System.out.println("School added successfully");

		System.out.println("School ID: " + school.getId());
		System.out.println("Name: " + school.getName());
		System.out.println("City: " + school.getCity());

		System.out.println("\nStudents:");

		school.getStudents().forEach(s -> System.out.println("  " + s.getName() + " - Grade " + s.getGrade()));
	}
}
