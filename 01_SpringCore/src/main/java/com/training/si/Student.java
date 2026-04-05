package com.training.si;

public class Student {
     
	private int StudentId;
	private String StudentName;
	private String StudentCourse;
	public Student(int studentId, String studentName, String studentCourse) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentCourse = studentCourse;
	}
	public Student() {
		super();
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentCourse() {
		return StudentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		StudentCourse = studentCourse;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentCourse=" + StudentCourse
				+ "]";
	}
	
	
	
	
}
