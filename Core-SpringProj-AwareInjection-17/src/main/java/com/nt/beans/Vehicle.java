package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;

public class Vehicle implements ApplicationContextAware {
	
	
	private ApplicationContext ac;
	private String dependentBeanId;
	
	
	
	
	public Vehicle(String dependentBeanId) {
		System.out.println("vehicle 1 param");
		this.dependentBeanId = dependentBeanId;
	}


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
	
	public void joureny(String source, String destination) {
		System.out.println("Vehicle.joureny()");
		
		
		
		
		Engine engine = ac.getBean(dependentBeanId,Engine.class);
		engine.start();
		System.out.println("vehicle started from :"+source );
		System.out.println("journy is going on from "+source+" to"+destination);
		
		engine.stop();
		System.out.println("reached destination :"+destination);
		 
		((AbstractApplicationContext) ac).close();
	
	}


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
		ac = applicationContext;
		
	}
	
	


}
