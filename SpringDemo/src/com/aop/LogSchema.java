package com.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogSchema {
	public void afterReturning(JoinPoint jp) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("&&&&&&&����֪ͨ-----");
	}
	public void before()  {
		System.out.println("&&&&&&ǰ��֪ͨ----");
		}
	public void whenException(JoinPoint jp,NullPointerException e) {
		System.out.println("&&&&&&&&�쳣"+e.getMessage());
	}
public Object around(ProceedingJoinPoint jp) throws Throwable {
	System.out.println("------------------����֪ͨ��ǰ��֪ͨ");
	Object result=null;
	try {
	 result=jp.proceed();
		System.out.println("------------------����֪ͨ������֪ͨ");

	}catch(Throwable e) {
		System.out.println("------------------����֪ͨ���쳣֪ͨ");
	}
	return result;
	
	

}
}
