package com.nt.bank;

public class LoanAmtDetails {
	
	private float pAmt;
	private float rate;
	private float time;
	public LoanAmtDetails() {
		System.out.println("LoanAmtDetails.- O Param()");
	}
	
	
	
	public float getPAmt() {
		return pAmt;
	}



	public void setPAmt(float pAmt) {
		this.pAmt = pAmt;
	}



	public float getRate() {
		return rate;
	}



	public void setRate(float rate) {
		this.rate = rate;
	}



	public float getTime() {
		return time;
	}



	public void setTime(float time) {
		this.time = time;
	}



	@Override
	public String toString() {
		return "LoanAmtDetails [pAmt=" + pAmt + ", rate=" + rate + ", time=" + time + "]";
	}
	
	

}
