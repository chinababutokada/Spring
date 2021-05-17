package com.nt;

import java.util.Locale;
import java.util.ResourceBundle;

public class UsingI18NSupportWithCoreJava {

	public static void main(String[] args) {
		
		//create locale object to hold language and county codes
		Locale locale = null;
		locale = new Locale(args[0],args[1]);
		
		//create resource bundle obj for to hold propertifile data based on passing the locale obj
       
		ResourceBundle bundle = null;
		bundle = ResourceBundle.getBundle("com/nt/commons/app",locale);
		
		System.out.println(bundle.getString("button1"));
		System.out.println(bundle.getString("button2"));
		System.out.println(bundle.getString("button3"));
		System.out.println(bundle.getString("button4"));
	}

}
