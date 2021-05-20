package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bank.LoanIntrestAmtCalc;

public class CustomPropertyEditors_ApplicationCotext {

	public static void main(String[] args) {
	
		ApplicationContext ac = null;
		
		ac = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		LoanIntrestAmtCalc calc=  ac.getBean("calc",LoanIntrestAmtCalc.class);
		System.out.println(calc.calcIntrest());
	}
		
}
