package com.nt.service;

import com.ext.ipl.IPLScoreComponent;

public class IPLScoreMgmtImpl implements IPLScoreMgmt {
	
	private IPLScoreComponent comp;
	
	
	
	public IPLScoreMgmtImpl(IPLScoreComponent comp) {
		
		super();
		System.out.println("IPLScoreMgmtImpl.IPLScoreMgmtImpl()");
		
		this.comp = comp;
	}



	@Override
	public String getScoreById(int mid) {
		System.out.println("IPLScoreMgmtImpl.getScoreById()");
		
		
		return comp.fetchScore(mid);
	}

}
