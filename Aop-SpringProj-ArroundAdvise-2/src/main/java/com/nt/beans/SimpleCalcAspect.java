package com.nt.beans;

import org.aspectj.lang.ProceedingJoinPoint;

public class SimpleCalcAspect {
	
	
	public SimpleCalcAspect() {
		super();
		System.out.println("SimpleCalcAspect.SimpleCalcAspect()");
	}

	public Object performanceMonitoring(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("SimpleCalcAspect.performanceMonitoring()");
		long startTime = System.currentTimeMillis();
	
		Object retValue = pjp.proceed();
		long endTime = System.currentTimeMillis();
		System.out.println(pjp.getSignature()+"method time taken for execution "+(endTime-startTime));
		
		return retValue;


    }
}
