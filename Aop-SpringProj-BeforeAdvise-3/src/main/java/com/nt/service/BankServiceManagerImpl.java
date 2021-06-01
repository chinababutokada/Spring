package com.nt.service;

import com.nt.dao.BankServicesDao;

public class BankServiceManagerImpl implements BankAccountServiceManager {

	private BankServicesDao dao;
	
	
	
	public BankServiceManagerImpl(BankServicesDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public String withDrawAmount(long acNo, float amount) {
		
		return dao.withdrawAmount(acNo, amount)!=0?"Amount With draw Sucessfully :"+amount:"Amount With draw failed :"+amount;
	}

	@Override
	public String depositAmount(long acNo, float amount) {
		
		return dao.depositAmount(acNo, amount)!=0?"Amount Deposit Sucessfully :"+amount:"Amount Deposit failed :"+amount;
	}

}
