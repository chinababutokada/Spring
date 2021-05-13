package com.nt.courier;

public class EKart implements Courier {
	
	

	public EKart() {
		System.out.println("EKart 0-Param Constructor ");
	}

	@Override
	public String delivery(int orderId) {
		System.out.println("EKart.delivery()");
		return "EKart Delivery the product of following id :"+orderId;
		
	}

}
