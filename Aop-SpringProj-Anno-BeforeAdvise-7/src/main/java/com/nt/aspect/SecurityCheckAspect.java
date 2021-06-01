package com.nt.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.service.IAuthenticateManagerService;

@Component
@Aspect
public class SecurityCheckAspect {
	
	
	
	@Autowired
	private IAuthenticateManagerService service;
	
	
	


	public SecurityCheckAspect() {
		super();
     System.out.println("SecurityCheckAspect.0 param");
	}




    @Before("execution(* com.nt.service.BankServiceManagerImpl.*(..))")
	public void securityCheck(JoinPoint jp)throws Throwable {
		
		if(!service.isValid()) {
			throw new IllegalAccessException("Invalid username and passwors");
		}
	}
	

}
