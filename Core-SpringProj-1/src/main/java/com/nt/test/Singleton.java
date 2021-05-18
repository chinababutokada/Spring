package com.nt.test;

public class Singleton {
	
	private static Singleton sp ;
	
	private Singleton() {
		
	}
    
	public Singleton getInstance() {
		
		return new Singleton();
		
	}
	
}
