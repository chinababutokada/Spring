package com.nt.beans;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

	
	
	public LoggingAspect() {
		super();
		System.out.println("LoggingAspect.LoggingAspect()");
	}

	public Object logging(ProceedingJoinPoint pjp) throws Throwable   {
		
		System.out.println("enter into logging method");
		System.out.println("calling Before:"+pjp.getSignature());
		Object retValue = pjp.proceed();
		System.out.println("calling After:"+pjp.getSignature());
		
		return retValue;
		
	}
	
}
