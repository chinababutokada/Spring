package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("bankDao")
public class BankServicesDaoImpl implements BankServicesDao {
   private static final String WITHDRAWAMOUNT= "UPDATE BANKACCOUNT SET AMOUNT=AMOUNT-? WHERE ACNO=?";
   private static final String DEPOSITAMOUNT= "UPDATE BANKACCOUNT SET AMOUNT=AMOUNT+? WHERE ACNO=?";
	
   @Autowired
   private JdbcTemplate jt;
	
	
	public BankServicesDaoImpl() {
		super();
		System.out.println("BankServicesDaoImpl-0 param");
	}

	@Override
	public int withdrawAmount(Long acNo, Float amt) {
		
		return jt.update(WITHDRAWAMOUNT, amt,acNo);
	}

	@Override
	public int depositAmount(Long acNo, Float amt) {
		
		return jt.update(DEPOSITAMOUNT, amt,acNo);
	}

}
