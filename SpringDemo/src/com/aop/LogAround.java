package com.aop;



import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAround implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		Object result=null;
		try {
			System.out.println("用环绕通知实现前置前置通知");
			result=invocation.proceed();//控制着addStudent（）目标方法的执行
			System.out.println("用环绕通知实现前置后置通知");
		}catch(Exception e) {
			System.out.println("用环绕通知实现前置异常通知");
		}
		return null;
	}

}
