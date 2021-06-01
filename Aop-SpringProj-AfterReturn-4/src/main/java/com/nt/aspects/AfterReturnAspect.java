package com.nt.aspects;

import java.io.FileWriter;
import java.io.IOException;

import org.aspectj.lang.JoinPoint;

public class AfterReturnAspect {
	
	
	public void coupn(JoinPoint jp,float billAmount) throws Throwable {
		System.out.println("AfterReturnAspect.coupn()");
		float discount = 0f;
		String coupn = null;
		if(billAmount<3000)
			discount = 3000/5;	
		else if(billAmount<5000)
			discount = 5000/10;	
		else if(billAmount<10000)
			discount = 10000/15;	
		FileWriter fw = new  FileWriter("E:/coupn");
		fw.write("Next Purchase reduced amount is :"+discount);
		fw.flush();
		fw.close();
	}
	public void invalidInputs(JoinPoint jp,Exception ex) throws Throwable {
		System.out.println("AfterReturnAspect.invalidInputs()");
		System.out.println(jp.getSignature()+" get Exception :"+ex.getMessage());
		
	}
	public void exceptionGrapher(JoinPoint jp,Exception ex) throws Throwable {
		System.out.println("AfterReturnAspect.exceptionGrapher()");
		throw new InvalidInputsExcepton(ex.getMessage());		
	}
}
