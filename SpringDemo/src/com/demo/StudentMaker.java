package com.demo;

public class StudentMaker {
	private Student student=null;
	public void show() {
		System.out.println(student.toString());
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	

}
