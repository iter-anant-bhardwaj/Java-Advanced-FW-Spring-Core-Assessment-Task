package com.capgemini.java_development.java_advance.framework.spring.core.Student_and_Course_Enrollment_System.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

public class Student implements Serializable {
	private int id;
    private String name;
    private Set<Course> courses;
	public Student() {
	}
	public Student(int id, String name, Set<Course> courses) {
		this.id = id;
		this.name = name;
		this.courses = courses;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(courses, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(courses, other.courses) && id == other.id && Objects.equals(name, other.name);
	}
    
}
