package com.nt.dao;

public interface BankServicesDao {
	
	public int withdrawAmount(Long acNo,Float amt);
	public int depositAmount(Long acNo,Float amt);

}
