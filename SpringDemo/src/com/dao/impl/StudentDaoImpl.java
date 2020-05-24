package com.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.demo.Student;
//@Component("studentDao")
@Repository("studentDao")

public class StudentDaoImpl implements IStudentDao {
	public void addStudent(Student student) {
		System.out.println("增加学生-------");
	}

}
