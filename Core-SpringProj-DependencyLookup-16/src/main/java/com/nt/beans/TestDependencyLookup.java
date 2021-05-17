package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDependencyLookup {

	public static void main(String[] args) {
		
		ApplicationContext ac= null;
		
		ac = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Vehicle vehicle = ac.getBean("vehicle",Vehicle.class);
		vehicle.fillfuel();
		vehicle.joureny("BZA", "CCT",ac,"engg");
		vehicle.soundHorn();
		vehicle.entertinement();
		
		((AbstractApplicationContext) ac).close();
		
	}

}
