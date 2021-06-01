package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("intrestCalc")
public  class IntrestCalculatorImpl implements IIntrestCalc {
  
	
	public IntrestCalculatorImpl() {
		super();
		System.out.println("IntrestCalculatorImpl-0 Param");
	}

	public    float calcSimpleIntrest(float pAmt,float rate, float time) {
		System.out.println("IntrestCalculatorImpl.calcSimpleIntrest()");
		
		
		return  (pAmt*rate*time/100.0f);
		
	}
	
	public float calcCompoundIntrest(float pAmt,float rate, float time) {
		
		System.out.println("IntrestCalculatorImpl.calcCompoundIntrest()");
		
		return (float) ((pAmt*Math.pow(1+rate/100, time)))-pAmt;
		
	}
	
	
}
  