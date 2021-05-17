package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WebContainer;

public class TestLMIProblem {

	public static void main(String[] args) {
		
		ApplicationContext ac = null;
		
		ac = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		WebContainer container = ac.getBean("webContainer",WebContainer.class);
		
		container.requestProcessing("nani");
		container.requestProcessing("raja");
		container.requestProcessing("rama");
        
		((AbstractApplicationContext) ac).close();
	}

}
