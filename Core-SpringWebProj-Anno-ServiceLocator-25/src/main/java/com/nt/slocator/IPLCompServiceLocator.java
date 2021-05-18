package com.nt.slocator;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import com.ext.ipl.IPLScoreCompImpl;
import com.ext.ipl.IPLScoreComponent;


@Component("locator")
public class IPLCompServiceLocator implements FactoryBean<IPLScoreComponent>{

	@Override
	public IPLScoreComponent getObject() throws Exception {
		System.out.println("IPLCompServiceLocator.getObject()");
		/*
		 * InitialContext ic = null;
		 * 
		 * ic = new InitialContext(); ic.lookup("");
		 */
		
		return new IPLScoreCompImpl();
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("IPLCompServiceLocator.getObjectType()");
		return IPLScoreCompImpl.class;
	}
	
	
	public boolean isSingleton() {
		System.out.println("IPLCompServiceLocator.isSingleton()");
		return true;
	}

	
	
	 

}
