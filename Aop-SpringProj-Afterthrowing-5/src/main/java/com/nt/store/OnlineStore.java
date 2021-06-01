package com.nt.store;

public class OnlineStore {
	
	
	public float shopping(String[] items,float[] prices) {
		System.out.println("OnlineStore.shopping()");
		float billAmt = 0f;
		
		for(float price:prices) {
			billAmt+=price;
		}
		
		return billAmt;
		
	  }

}
