package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.impl.IStudentDao;
import com.dao.impl.StudentDaoImpl;
import com.service.IStudentService;

public class Test {
	public static void testDI() {
		ApplicationContext a=new ClassPathXmlApplicationContext("application.xml");
		Course course=(Course)a.getBean("course");
		course.showInfo();
	}
	public static void collectionDemo() {
		ApplicationContext a=new ClassPathXmlApplicationContext("application.xml");
		AllCollectionTYpe ap=(AllCollectionTYpe)a.getBean("collectionDemo");
		System.out.println(ap);
	}
	public static void testAop() {
		ApplicationContext a=new ClassPathXmlApplicationContext("application.xml");
		IStudentService ap=(IStudentService)a.getBean("studentService");
		Student student=new Student();
		student.setStuname("zs");
		student.setStuno("123");
			
	    ap.addStudent(student);
	    ap.deleteStudentByNo("1");
	}
	public static void main(String[] args) {
//		ApplicationContext a=new ClassPathXmlApplicationContext("application.xml");
		
		//Hello helloWord=(Hello)a.getBean("helloWord");
		//helloWord.say();
		
//		
//		Student student=(Student)a.getBean("student");
//		System.out.println(student);
//		StudentMaker studentmaker=(StudentMaker)a.getBean("studentMaker");
//		studentmaker.show();
//		testDI();
	//	collectionDemo();
		testAop();
		}

}
