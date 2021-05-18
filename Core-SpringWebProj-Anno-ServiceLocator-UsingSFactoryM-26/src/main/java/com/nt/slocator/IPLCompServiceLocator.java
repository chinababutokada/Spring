package com.nt.slocator;

import com.ext.ipl.IPLScoreCompImpl;

public interface IPLCompServiceLocator {
  
	
	public static IPLScoreCompImpl getInstance() {
		System.out.println("IPLCompServiceLocator.getInstance()");
		return new IPLScoreCompImpl();
	}
	
	 

}
