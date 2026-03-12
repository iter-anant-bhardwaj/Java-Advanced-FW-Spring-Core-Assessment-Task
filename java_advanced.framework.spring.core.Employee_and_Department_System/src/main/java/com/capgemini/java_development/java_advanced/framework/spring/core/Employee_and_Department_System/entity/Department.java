package com.capgemini.java_development.java_advanced.framework.spring.core.Employee_and_Department_System.entity;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {
	private Integer id;
    private String name;
    private String location;
	public Department() {
	}
	public Department(Integer id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, location, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id) && Objects.equals(location, other.location)
				&& Objects.equals(name, other.name);
	}
    
    
}
