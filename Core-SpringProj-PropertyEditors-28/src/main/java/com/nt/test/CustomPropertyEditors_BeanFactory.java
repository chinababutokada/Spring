package com.nt.test;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.bank.LoanIntrestAmtCalc;

public class CustomPropertyEditors_BeanFactory {

	public static void main(String[] args) {
	
		DefaultListableBeanFactory factory = null;
		
		factory = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		CustomEditorConfigurer cec = factory.getBean(CustomEditorConfigurer.class);
		cec.postProcessBeanFactory(factory);
		
		LoanIntrestAmtCalc calc=  factory.getBean("calc",LoanIntrestAmtCalc.class);
		System.out.println(calc.calcIntrest());
	}
		
}
