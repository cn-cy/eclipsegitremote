package com.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogSchema {
	public void afterReturning(JoinPoint jp) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("&&&&&&&后置通知-----");
	}
	public void before()  {
		System.out.println("&&&&&&前置通知----");
		}
	public void whenException(JoinPoint jp,NullPointerException e) {
		System.out.println("&&&&&&&&异常"+e.getMessage());
	}
public Object around(ProceedingJoinPoint jp) throws Throwable {
	System.out.println("------------------环绕通知，前置通知");
	Object result=null;
	try {
	 result=jp.proceed();
		System.out.println("------------------环绕通知，后置通知");

	}catch(Throwable e) {
		System.out.println("------------------环绕通知，异常通知");
	}
	return result;
	
	

}
}
