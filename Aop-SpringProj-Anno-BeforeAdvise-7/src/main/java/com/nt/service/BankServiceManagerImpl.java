package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.BankServicesDao;

@Service("bankService")
public class BankServiceManagerImpl implements BankAccountServiceManager {

	@Autowired
	private BankServicesDao dao;
	
	
	
	

	public BankServiceManagerImpl() {
		super();
		System.out.println("BankServiceManagerImpl.-0 param ");
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
