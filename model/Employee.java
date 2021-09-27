package com.revature.app.model;

import java.util.List;
import java.util.stream.Collectors;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private String gender;
	private Department department;
	private List<Skill> skillList;
	
	public Employee() {}

	public Employee(int id, String name, double salary, String gender, Department department, List<Skill> skillList) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
		this.department = department;
		this.skillList = skillList;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Skill> getSkillList() {
		return skillList;
	}

	public void setSkillList(List<Skill> skillList) {
		this.skillList = skillList;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", gender=" + gender + ", department="
				+ department.getName() + ", skillList=" + skillList.stream().map(e -> e.getName()).collect(Collectors.toList()) + "]";
	}

}
