package com.nt.service;

public interface BankAccountServiceManager {
	
	public String withDrawAmount(long acNo,float amount);
	public String depositAmount(long acNo,float amount);

}
