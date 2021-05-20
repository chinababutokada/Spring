package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.bank.LoanAmtDetails;
import com.nt.bank.LoanIntrestAmtCalc;
import com.nt.customeditors.LoanDetailsCustomEditor;

public class CustomPropertyEditors_TestFunctionInterface {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = null;
		BeanDefinitionReader reader = null;
		
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		factory.addPropertyEditorRegistrar(registry->{
			registry.registerCustomEditor(LoanAmtDetails.class, new LoanDetailsCustomEditor());
			
		});
			
			
		LoanIntrestAmtCalc calc = factory.getBean("calc",LoanIntrestAmtCalc.class);
		
		float result = calc.calcIntrest();
		
		System.out.println("result :"+result);

	}
	/*
	 * private static class CustomPropertyRegister implements
	 * PropertyEditorRegistrar{
	 * 
	 * @Override public void registerCustomEditors(PropertyEditorRegistry registry)
	 * { System.out.println(
	 * "CustomPropertyEditors.CustomPropertyRegister.registerCustomEditors()");
	 * 
	 * registry.registerCustomEditor(LoanAmtDetails.class, new
	 * LoanDetailsCustomEditor());
	 * 
	 * }
	 * 
	 * }
	 */
}
