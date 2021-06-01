package com.nt.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class SimpleCalcAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("SimpleCalcAspect.invoke()");
		long startTime = System.currentTimeMillis();
		Object[] args = invocation.getArguments();
		 args[1] = (float)args[0]>=10000? 1f:2f;
		Object retValue = invocation.proceed();
	     //retValue = (float) retValue*2/100;
	     
	     args[1] = (float)args[0]>=10000? 1f:2f;
		long endTime = System.currentTimeMillis();
		System.out.println(invocation.getMethod()+" "+"With :"+(endTime-startTime));
		return retValue;
	}
	
	
	

}
