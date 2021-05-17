package com.nt.replacers;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class SimpleIntrestMethodReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("SimpleIntrestMethodReplacer.reimplement()");
		float pAmt = (float) args[0];
		float rate = (float) args[1];
		float time = (float) args[2];
		
		return  pAmt * rate* time/100.0f;
	}

}
