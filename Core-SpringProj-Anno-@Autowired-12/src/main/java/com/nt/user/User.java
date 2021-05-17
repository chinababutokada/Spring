package com.nt.user;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comp.Flipkart;

public class User {

	public static void main(String[] args) {
		
		ApplicationContext ac = null;
		
		ac = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		Flipkart flipkart = ac.getBean("flipkart",Flipkart.class);
		String result = flipkart.buyProducts(new String[]{"soaps","charger"});
		System.out.println("result : "+result);
		((AbstractApplicationContext) ac).close();
	}

}
