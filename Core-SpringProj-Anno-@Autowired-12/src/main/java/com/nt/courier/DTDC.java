package com.nt.courier;

import org.springframework.context.annotation.Primary;


public class DTDC implements Courier {
	
	

	public DTDC() {
		System.out.println("DTDC 0-Param Constructor ");
	}

	@Override
	public String delivery(int orderId) {
		System.out.println("DTDC.delivery()");
		return "DTDC Delivery the product of following id :"+orderId;
		
	}

}
