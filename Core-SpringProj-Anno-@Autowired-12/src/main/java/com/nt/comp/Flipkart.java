package com.nt.comp;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.nt.courier.Courier;

public class Flipkart {
	
	//@Autowired(required = true)
	//@Qualifier("blue")
	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart 0-Param Constructor ");
	}

	//@Autowired(required = true)
	public Flipkart(Courier courier) {
		super();
		System.out.println("Flipkart 1-Param Constructor ");
		this.courier = courier;
	}

	public Courier getCourier() {
		return courier;
	}
    
	@Autowired
	@Qualifier("blue")
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}
	
    public String buyProducts(String[] items) {
    	
    	System.out.println("Flipkart.buyProducts()");
    	
		return courier.delivery(new Random().nextInt());
    	
    }

}
