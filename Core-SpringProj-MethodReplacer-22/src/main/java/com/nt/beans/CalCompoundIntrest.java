package com.nt.beans;

public  class CalCompoundIntrest {
	
	public final float  calCompoundIntrest(float pAmt,float rate,float time) {
		
		System.out.println("CalCompoundIntrest.calCompoundIntrest()");
		
		
		return (float) (pAmt*Math.pow(1+rate/100, time)-pAmt);
				
		
	}

}
