package com.nt.aspect;
import org.aspectj.lang.JoinPoint;

import com.nt.service.IAuthenticateManagerService;

public class SecurityCheckAspect {
	
	private IAuthenticateManagerService service;
	
	
	public SecurityCheckAspect(IAuthenticateManagerService service) {
		super();
		this.service = service;
	}


	public void securityCheck(JoinPoint jp)throws Throwable {
		
		if(!service.isValid()) {
			throw new IllegalAccessException("Invalid username and passwors");
		}
	}
	

}
