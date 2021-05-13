package com.nt.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {

	public static void main(String[] args) {
		
		/*DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		Flipkart flipkart = factory.getBean("flipkart",Flipkart.class);
		String result = flipkart.buyProducts(new String[]{"soaps","charger"});
		System.out.println("result : "+result);*/
		
		ApplicationContext ac = null;
		
		ac = new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		
		
	}

}
