package com.nt.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comp.Flipkart;

public class User {

	public static void main(String[] args) {
		
		ApplicationContext ac = null;
		
		ac = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		Flipkart flipkart1 = ac.getBean("flipkart",Flipkart.class);
		Flipkart flipkart2 = ac.getBean("flipkart",Flipkart.class);
		System.out.println("flipkart1: "+flipkart1.hashCode()+"...."+"flipkart2: "+flipkart2.hashCode());
//		String result = flipkart.buyProducts(new String[]{"soaps","charger"});
//		System.out.println("result : "+result);
//		((AbstractApplicationContext) ac).close();
	}

}
