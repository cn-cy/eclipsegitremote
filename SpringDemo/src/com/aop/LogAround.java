package com.aop;



import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAround implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		Object result=null;
		try {
			System.out.println("�û���֪ͨʵ��ǰ��ǰ��֪ͨ");
			result=invocation.proceed();//������addStudent����Ŀ�귽����ִ��
			System.out.println("�û���֪ͨʵ��ǰ�ú���֪ͨ");
		}catch(Exception e) {
			System.out.println("�û���֪ͨʵ��ǰ���쳣֪ͨ");
		}
		return null;
	}

}
