package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component("logAnnotation")//跟bean作用同
@Aspect
public class LogBeforeAnnotation {
	@Before("execution(public void com.service.StudentServiceImpl.addStudent(com.demo.Student))")
public void myBefore() {
	System.out.println("注解形式---------前置通知");
}
	@AfterReturning("execution(public void com.service.StudentServiceImpl.addStudent(com.demo.Student))")
	public void myAfter() {
		System.out.println("注解形式---------后置通知");
	}

		@AfterThrowing("execution(public void com.service.StudentServiceImpl.addStudent(com.demo.Student))")
		public void myException() {
			System.out.println("注解形式---------异常通知");
		}
@Around("execution(public void com.service.StudentServiceImpl.addStudent(com.demo.Student))")
public void myAround(ProceedingJoinPoint jp) {
	try {
		jp.proceed();
		System.out.println("方法之前---环绕-----前置通知");
		System.out.println("方法之前----环绕----后置通知");

	}catch(Throwable th) {
		System.out.println("方法之前--环绕------异常通知");

	}finally {
		System.out.println("最终");

	}
}

@After("execution(public void com.service.StudentServiceImpl.addStudent(com.demo.Student))")
public void myAfter2() {
	System.out.println("环绕-------最终通知");
}
}
