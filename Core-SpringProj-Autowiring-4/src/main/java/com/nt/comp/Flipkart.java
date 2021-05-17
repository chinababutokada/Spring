package com.nt.comp;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.nt.courier.Courier;

//public class Flipkart implements DisposableBean,InitializingBean {
public class Flipkart {
	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart 0-Param Constructor ");
	}

	public Flipkart(Courier courier) {
		super();
		System.out.println("Flipkart 1-Param Constructor ");
		this.courier = courier;
	}

	public Courier getCourier() {
		return courier;
	}

	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}
	
	 @PostConstruct
	 public void myinit() { 
		 System.out.println("Flipkart.myinit()");
	 }

	
    public String buyProducts(String[] items) {
    	
    	System.out.println("Flipkart.buyProducts()");
    	
		return courier.delivery(new Random().nextInt());
    	
    }
   @PreDestroy  
   public void mydestroy() { System.out.println("Flipkart.mydistroy()"); }
	 

	/*
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("Flipkart.afterPropertiesSet()"); }
	 * 
	 * @Override public void destroy() throws Exception {
	 * System.out.println("Flipkart.destroy()");
	 * 
	 * }
	 */

}
