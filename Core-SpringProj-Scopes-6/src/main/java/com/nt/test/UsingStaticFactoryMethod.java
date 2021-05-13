package com.nt.test;



import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Flipkart;
import com.nt.dp.Printer;

public class UsingStaticFactoryMethod {
	
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/nt/resorces/applicationContext.xml");
//		Flipkart fpkt1 =  factory.getBean("fpkt",Flipkart.class);
//		
//		System.out.println("fpkt1:"+fpkt1.hashCode());
//		Flipkart fpkt2 =  factory.getBean("fpkt",Flipkart.class);
//		
//		System.out.println("fpkt2:"+fpkt2.hashCode());
		
		Printer printer1 =  factory.getBean("dp",Printer.class);
		System.out.println("printer1:"+printer1.hashCode());
		Printer printer2 =  factory.getBean("dp",Printer.class);
		
		System.out.println("printer2:"+printer2.hashCode());
		
		
	}
	
	
	
	
	

}
	
	


