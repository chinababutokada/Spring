package com.nt.test;

import java.util.Date;

public class WishMsgGenerator {
	
	private Date date;

    
	public WishMsgGenerator(Date date) {
		this.date = date;
	}

//	public void setDate(Date date) {
//		this.date = date;
//	}
	
	public String generateWishMsg(String name) {
		int hours = date.getHours();
		
		if(hours<12)
			return "Good Morning : "+name;
		if(hours<16)
			return "Good Evening : "+name;
		if(hours<24)
			return "Good Night : "+name;
		return null;
		
	}
	
	

}
