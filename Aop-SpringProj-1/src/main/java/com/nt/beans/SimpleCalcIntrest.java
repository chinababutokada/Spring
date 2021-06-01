package com.nt.beans;


public final class SimpleCalcIntrest implements ISimpleCalc{
  
	@Override
	public   final float calcSimpleIntrest(float pAmt,float rate, float time) {
		System.out.println("SimpleCalcIntrest.calcSimpleIntrest()");
		
		
		return (float) (pAmt*rate*time/100.0f);
		
	}
	
	
}
  