package com.nt.beans;

public class WebContainer {

	private RequestHandler handler;

	public WebContainer(RequestHandler handler) {
		System.out.println("WebContainer.WebContainer()-1param");
		this.handler = handler;
	}
	
	public void requestProcessing(String data) {
		System.out.println("web containtier handover the request to request handler with" +data);
		handler.processRequest(data);
		
	}
	
}
