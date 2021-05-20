package com.nt.bank;


public class LoanIntrestAmtCalc {
	
	
	private LoanAmtDetails  details;
	
	
	
	
	public LoanIntrestAmtCalc(LoanAmtDetails details) {
		super();
		System.out.println("LoanIntrestAmtCalc.1 Param const()");
		this.details = details;
	}




	public float calcIntrest() {
		
		
		return (float) (details.getPAmt()*details.getRate()*details.getTime()/100.0f);
		
	}

}
