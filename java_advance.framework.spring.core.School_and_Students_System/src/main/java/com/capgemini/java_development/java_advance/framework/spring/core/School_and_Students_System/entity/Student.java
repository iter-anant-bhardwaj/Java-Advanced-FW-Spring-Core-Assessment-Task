package com.capgemini.java_development.java_advance.framework.spring.core.School_and_Students_System.entity;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
	private Integer id;
    private String name;
    private Integer grade;
	public Student() {
	}
	public Student(Integer id, String name, Integer grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(grade, id, name);
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
		return Objects.equals(grade, other.grade) && Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
    
    
}
