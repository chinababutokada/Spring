package com.nt.courier;

public interface Courier {
	
	public String delivery(int orderId);
	public Courier getCourierObj(String type);

}
