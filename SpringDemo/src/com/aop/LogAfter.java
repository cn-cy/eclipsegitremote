package com.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
<<<<<<< HEAD
//123456
=======
//12345
>>>>>>> branch 'master' of https://github.com/cn-cy/eclipsegitremote.git
//abcd
public class LogAfter implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("ºóÖÃÍ¨Öª-----");
	}

}
