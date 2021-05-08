package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class InjectingArrayValuesTest {

	public static void main(String[] args) {
		
	 DefaultListableBeanFactory factory = null;
	 XmlBeanDefinitionReader reader = null;
	 
	 factory = new DefaultListableBeanFactory();
	 reader = new XmlBeanDefinitionReader(factory);
	 reader.loadBeanDefinitions("applicationContext.xml");
	 
//	 InjectingArraySimpleValues_RefValues val = factory.getBean("injArrayVals",InjectingArraySimpleValues_RefValues.class);
	 
//	 InjectingListSimpleValues_RefValues val = factory.getBean("injListval",InjectingListSimpleValues_RefValues.class);
//	 InjectingSetSimpleValues_RefValues val = factory.getBean("injSetval",InjectingSetSimpleValues_RefValues.class);
	 InjectingMapSimpleValues_RefValues val = factory.getBean("injMapVal",InjectingMapSimpleValues_RefValues.class);
	 
	 System.out.println(val);
   
	}

}
