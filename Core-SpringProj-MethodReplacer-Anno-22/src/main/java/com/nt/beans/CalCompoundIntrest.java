package com.nt.beans;


public  class CalCompoundIntrest {
	
	public  float  calCompoundIntrest(float pAmt,float rate,float time) {
		
		System.out.println("CalCompoundIntrest.calCompoundIntrest()-1");
		
		
		return (float) (pAmt*Math.pow(1+rate/100, time)-pAmt);
				
		
	}
    public  float  calCompoundIntrest(float pAmt,float rate,int time) {
		
		System.out.println("CalCompoundIntrest.calCompoundIntrest()-2");
		
		
		return (float) (pAmt*Math.pow(1+rate/100, time)-pAmt);
				
		
	}

}
