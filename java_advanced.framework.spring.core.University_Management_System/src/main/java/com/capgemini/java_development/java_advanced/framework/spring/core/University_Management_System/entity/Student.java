package com.capgemini.java_development.java_advanced.framework.spring.core.University_Management_System.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

public class Student implements Serializable {
	private int id;
    private String name;

    private StudentProfile profile; // 1:1
    private Department department;  // M:1
    private Set<Course> courses;	// M:M
	public Student() {
	}
	public Student(int id, String name, StudentProfile profile, Department department, Set<Course> courses) {
		this.id = id;
		this.name = name;
		this.profile = profile;
		this.department = department;
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
	public StudentProfile getProfile() {
		return profile;
	}
	public void setProfile(StudentProfile profile) {
		this.profile = profile;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", profile=" + profile + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(courses, department, id, name, profile);
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
		return Objects.equals(courses, other.courses) && Objects.equals(department, other.department) && id == other.id
				&& Objects.equals(name, other.name) && Objects.equals(profile, other.profile);
	}
    
    
}
