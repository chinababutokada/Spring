package com.nt.beans;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("logAsp")
@Aspect
public class LoggingAspect {

	
	
	public LoggingAspect() {
		super();
		System.out.println("LoggingAspect-0 param");
	}

	@Around("execution(* com.nt.beans.IntrestCalculatorImpl.*(..))")
	
	public Object logging(ProceedingJoinPoint pjp) throws Throwable   {
		
		System.out.println("enter into logging method");
		System.out.println("calling Before:"+pjp.getSignature());
		Object retValue = pjp.proceed();
		System.out.println("calling After:"+pjp.getSignature());
		
		return retValue;
		
	}
	
}
