package com.training.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentDetails")
public class Student {
	
	@Id
	private int id;
	private String name;
	private String studentCity;
	
	public Student() {
		
	}

	public Student(int id, String name, String studentCity) {
		super();
		this.id = id;
		this.name = name;
		this.studentCity = studentCity;
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

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", studentCity=" + studentCity + "]";
	}
	

}
