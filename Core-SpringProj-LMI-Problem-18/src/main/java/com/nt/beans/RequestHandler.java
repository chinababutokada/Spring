package com.nt.beans;

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
