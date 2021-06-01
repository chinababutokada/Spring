package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BankServicesDaoImpl implements BankServicesDao {
   private static final String WITHDRAWAMOUNT= "UPDATE BANKACCOUNT SET AMOUNT=AMOUNT-? WHERE ACNO=?";
   private static final String DEPOSITAMOUNT= "UPDATE BANKACCOUNT SET AMOUNT=AMOUNT+? WHERE ACNO=?";
	private JdbcTemplate jt;
	
	
	public BankServicesDaoImpl(JdbcTemplate jt) {
		super();
		this.jt = jt;
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
