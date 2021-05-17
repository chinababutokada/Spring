package com.nt.comp;

import java.util.Random;

import javax.inject.Inject;
import javax.inject.Named;

import com.nt.courier.Courier;

@Named("flipkart")
public class Flipkart {
	
	@Inject
	@Named("ekart")
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
	
    public String buyProducts(String[] items) {
    	
    	System.out.println("Flipkart.buyProducts()");
    	
		return courier.delivery(new Random().nextInt());
    	
    }

}
