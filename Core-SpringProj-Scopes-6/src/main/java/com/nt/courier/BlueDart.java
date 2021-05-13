package com.nt.courier;

public class BlueDart implements Courier {
	
	

	public BlueDart() {
		System.out.println("BlueDart 0-Param Constructor ");
	}

	@Override
	public String delivery(int orderId) {
		System.out.println("BlueDart.delivery()");
		return "BlueDart Delivery the product of following id :"+orderId;
		
	}
   public  Courier getCourierObj(String type) {
		
		System.out.println("CourierObj.getCourierObj()");
		Courier courier = null;
		
		if(type.equalsIgnoreCase("blue"))
			courier = new BlueDart();
		
		
		
		
		return courier;
		
	}
}
