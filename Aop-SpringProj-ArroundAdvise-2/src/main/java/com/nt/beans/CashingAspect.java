package com.nt.beans;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CashingAspect {
	
	
	Map<String,Object> cacheMap = new HashMap<>();
	
	public CashingAspect() {
		super();
		System.out.println("CashingAspect- 0 param");
	}
	
	@Around("execution(* com.nt.beans.IntrestCalculatorImpl.*(..))")
	public Object cashing(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("CashingAspect.cashing()");
		
		Object value = null;
		String key = pjp.getSignature()+Arrays.toString(pjp.getArgs());
		
		if(!cacheMap.containsKey(key)) {
			System.out.println("if");
			 value = pjp.proceed();
			cacheMap.put(key, value);
		}
		else {
			System.out.println("else");
			 value = cacheMap.get(key);
		}
		
		return value;
		
	}


}
