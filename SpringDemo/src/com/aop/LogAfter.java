package com.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
//123456
//abcd
public class LogAfter implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("ºóÖÃÍ¨Öª-----");
	}

}
