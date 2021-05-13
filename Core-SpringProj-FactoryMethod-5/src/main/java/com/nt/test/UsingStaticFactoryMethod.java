package com.nt.test;



import java.sql.Connection;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.courier.Courier;

public class UsingStaticFactoryMethod {
	
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/nt/resorces/applicationContext.xml");
		Courier c2 =  factory.getBean("c2",Courier.class);
		System.out.println(c2.getClass().getName()+"..........."+c2.toString());
		
		Courier c3 =  factory.getBean("c3",Courier.class);
		System.out.println(c2.getClass().getName()+"..........."+c2.toString());
		
		Connection con =  factory.getBean("con",Connection.class);
		
		System.out.println(con.getClass()+"..."+con.getClass().getName()+"..........."+con.toString());

		 System.out.println("..............................................................");
	      String str3=factory.getBean("s3",String.class);
	       System.out.println("str3 obj class name::"+str3.getClass().getName()+" str3 obj data::"+str3.toString());
		
	}
	
	
	
	
	

}
	
	


