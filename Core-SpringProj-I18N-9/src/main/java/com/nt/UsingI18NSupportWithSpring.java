package com.nt;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingI18NSupportWithSpring {
	
	public static void main(String[] args) {
		System.out.println("UsingI18NSupportWithSpring.main()");
		ApplicationContext ac = null;
		
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Locale locale = new Locale(args[0],args[1]) ;
//		String button1 = ac.getMessage("button1", null, null, locale);
//		String button2 = ac.getMessage("button2", null, null, locale);
//		String button3 = ac.getMessage("button3", null, null, locale);
//		String button4 = ac.getMessage("button4", null, null, locale);
//		System.out.println(button1);
//		System.out.println(button2);
//		System.out.println(button3);
//		System.out.println(button4);
		
		String button1 = ac.getMessage("button1", new String[] {"object","studden"}, "keyNotfound", locale);
		String button2 = ac.getMessage("button2", null, null, locale);
		String button3 = ac.getMessage("button3", null, null, locale);
		String button4 = ac.getMessage("button4", null, null, new Locale("te","in"));
		System.out.println(button1);
		System.out.println(button2);
		System.out.println(button3);
		System.out.println(button4);
		
	}

}
