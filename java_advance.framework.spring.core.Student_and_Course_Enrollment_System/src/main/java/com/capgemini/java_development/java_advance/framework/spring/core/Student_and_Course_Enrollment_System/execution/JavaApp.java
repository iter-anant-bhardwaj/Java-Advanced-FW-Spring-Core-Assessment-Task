package com.capgemini.java_development.java_advance.framework.spring.core.Student_and_Course_Enrollment_System.execution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.java_development.java_advance.framework.spring.core.Student_and_Course_Enrollment_System.entity.Student;

public class JavaApp {
	public static void execution() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Student student = context.getBean("student", Student.class);

		System.out.println("Enrollment successful\n");

		System.out.println("Student ID: " + student.getId());
		System.out.println("Name: " + student.getName());

		System.out.println("\nCourses Enrolled:");

		student.getCourses()
				.forEach(c -> System.out.println("  " + c.getCourseName() + " (" + c.getCredits() + " Credits)"));
	}
}
