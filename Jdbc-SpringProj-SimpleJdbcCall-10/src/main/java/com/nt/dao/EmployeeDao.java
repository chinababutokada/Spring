package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	
	@Autowired
	private SimpleJdbcCall getJTObject;

	public EmployeeDao() {
		super();
		System.out.println("EmployeeDao.0 - param()");
	}
	
	
	public String checkAuth(String uName,String pwd){
		
		getJTObject.setProcedureName("P_CHECKAUTHENDICATION");
		
		
		
		
	  
	   return getJTObject.executeObject(String.class,uName,pwd );
	
	}

}
