package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ext.ipl.IPLScoreComponent;

@Service("service")
public class IPLScoreMgmtImpl implements IPLScoreMgmt {
	
	@Autowired
	private IPLScoreComponent comp;
	
	
	
	



	public IPLScoreMgmtImpl() {
		super();
	    System.out.println("Service class 0 param");
	}







	@Override
	public String getScoreById(int mid) {
		System.out.println("IPLScoreMgmtImpl.getScoreById()");
		
		
		return comp.fetchScore(mid);
	}

}
