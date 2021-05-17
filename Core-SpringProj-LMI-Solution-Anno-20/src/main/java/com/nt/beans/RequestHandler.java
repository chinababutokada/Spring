package com.nt.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class RequestHandler {
	
	private static int count;

	public RequestHandler() {
		System.out.println("RequestHandler.0 - param()");
		count++;
	}

	public void processRequest(String data) {
		
		System.out.println("request processed with "+data+" object count"+count);
		
	}
	
	

}
