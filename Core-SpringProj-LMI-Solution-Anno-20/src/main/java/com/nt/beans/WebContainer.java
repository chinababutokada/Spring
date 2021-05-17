package com.nt.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/* public interface  WebContainer {

	
	  public abstract RequestHandler createHandlerObject();
		 


	   public default  void requestProcessing(String data) {
		System.out.println("web containtier handover the request to request handler with" +data);
		RequestHandler  handler = createHandlerObject();
		handler.processRequest(data);
		
	}
	
}*/

@Component
public abstract class  WebContainer {

	 
	  public WebContainer() {
		super();
		System.out.println("webcontainer 0 param");
	}


    @Lookup("requestHandler")
	public abstract RequestHandler createHandlerObject();
		 


	   public   void requestProcessing(String data) {
		System.out.println("web containtier handover the request to request handler with" +data);
		RequestHandler  handler = createHandlerObject();
		handler.processRequest(data);
		
	}
	
}
