package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.CalCompoundIntrest;

public class TestMethodReplacer {

	public static void main(String[] args) {
		ApplicationContext ac = null;
		
		ac = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		CalCompoundIntrest comp = ac.getBean("comp",CalCompoundIntrest.class);
		float result = comp.calCompoundIntrest(1000f, 1f, 12f);
		System.out.println("Result:"+result);
		((AbstractApplicationContext) ac).close();
	}

}
