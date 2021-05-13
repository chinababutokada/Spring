package com.nt.courier;

public class CourierObj {
	
	CourierObj(){
		System.out.println("o-param Constructor");
	}
	
	public static Courier getCourierObj(String type) {
		
		System.out.println("CourierObj.getCourierObj()");
		Courier courier = null;
		
		if(type.equalsIgnoreCase("blue"))
			courier = new BlueDart();
		else if(type.equalsIgnoreCase("dtdc"))
			courier = new DTDC();
		else if(type.equalsIgnoreCase("ekart"))
			courier = new EKart();
		
		
		
		return courier;
		
	}

}
