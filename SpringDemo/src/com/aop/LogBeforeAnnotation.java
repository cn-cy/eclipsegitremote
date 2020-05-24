package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component("logAnnotation")//��bean����ͬ
@Aspect
public class LogBeforeAnnotation {
	@Before("execution(public void com.service.StudentServiceImpl.addStudent(com.demo.Student))")
public void myBefore() {
	System.out.println("ע����ʽ---------ǰ��֪ͨ");
}
	@AfterReturning("execution(public void com.service.StudentServiceImpl.addStudent(com.demo.Student))")
	public void myAfter() {
		System.out.println("ע����ʽ---------����֪ͨ");
	}

		@AfterThrowing("execution(public void com.service.StudentServiceImpl.addStudent(com.demo.Student))")
		public void myException() {
			System.out.println("ע����ʽ---------�쳣֪ͨ");
		}
@Around("execution(public void com.service.StudentServiceImpl.addStudent(com.demo.Student))")
public void myAround(ProceedingJoinPoint jp) {
	try {
		jp.proceed();
		System.out.println("����֮ǰ---����-----ǰ��֪ͨ");
		System.out.println("����֮ǰ----����----����֪ͨ");

	}catch(Throwable th) {
		System.out.println("����֮ǰ--����------�쳣֪ͨ");

	}finally {
		System.out.println("����");

	}
}

@After("execution(public void com.service.StudentServiceImpl.addStudent(com.demo.Student))")
public void myAfter2() {
	System.out.println("����-------����֪ͨ");
}
}
