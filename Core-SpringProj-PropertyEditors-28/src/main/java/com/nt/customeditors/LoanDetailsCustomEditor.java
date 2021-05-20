package com.nt.customeditors;

import java.beans.PropertyEditorSupport;

import com.nt.bank.LoanAmtDetails;

public class LoanDetailsCustomEditor extends PropertyEditorSupport{

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		System.out.println("LoanDetailsCustomEditor.setAsText()");
		String[] textValues = text.split(",");
		float pAmt = Float.parseFloat(textValues[0]);
		float rate = Float.parseFloat(textValues[1]);
		float time = Float.parseFloat(textValues[2]);
		
		LoanAmtDetails details = new LoanAmtDetails();
		
		details.setPAmt(pAmt);
		details.setRate(rate);
		details.setTime(time);
		
		setValue(details);
		
		
	}
	
	
}
