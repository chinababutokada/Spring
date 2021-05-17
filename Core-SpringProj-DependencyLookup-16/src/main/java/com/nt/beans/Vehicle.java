package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vehicle {
	
	
	//private String dependentBeanId;
	
	
	
	public Vehicle() {
		super();
		System.out.println("Vehicle.Vehicle-0 param ()");
	}
	
	
	









	public void entertinement() {
		
		System.out.println("Vehicle.entertinement()");
	}
	
	public void soundHorn() {
		System.out.println("Vehicle.soundHorn()");
	}
	
	public void fillfuel() {
		System.out.println("Vehicle.fillfuel()");
	}
	
	/*public void joureny(String source, String destination) {
		System.out.println("Vehicle.joureny()");
		
		ApplicationContext ctx = null;
		
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Engine engine = ctx.getBean(dependentBeanId,Engine.class);
		engine.start();
		System.out.println("vehicle started from :"+source );
		System.out.println("journy is going on from "+source+" to"+destination);
		
		engine.stop();
		System.out.println("reached destination :"+destination);
		 
		((AbstractApplicationContext) ctx).close();
	
	}*///Version 1
	
	public void joureny(String source, String destination,ApplicationContext ctx,String dependentBeanId) {
	System.out.println("Vehicle.joureny()");
	
	/*
	 * ApplicationContext ctx = null;
	 * 
	 * ctx = new
	 * ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	 */
	Engine engine = ctx.getBean(dependentBeanId,Engine.class);
	engine.start();
	System.out.println("vehicle started from :"+source );
	System.out.println("journy is going on from "+source+" to"+destination);
	
	engine.stop();
	System.out.println("reached destination :"+destination);
	 
	((AbstractApplicationContext) ctx).close();

}//Version 2


}
