package com.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.impl.IStudentDao;
import com.demo.Student;

public class StudentServiceImpl implements IStudentService {
IStudentDao studentDao;
	public void setStudentDao(IStudentDao studentDao) {
	this.studentDao = studentDao;
}
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED)
	
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
//		studentDao=null;
//		studentDao.addStudent(student);
		System.out.println("增加学生----****---");
		
	}
	@Override
	public void deleteStudentByNo(String stuNo) {
		// TODO Auto-generated method stub
		System.out.println("删除------");
	}
	
}
