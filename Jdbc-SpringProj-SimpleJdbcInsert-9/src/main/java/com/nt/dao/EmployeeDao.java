package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBo;

@Repository
public class EmployeeDao {
	
	@Autowired
	private SimpleJdbcInsert getJTObject;

	public EmployeeDao() {
		super();
		System.out.println("EmployeeDao.0 - param()");
	}
	
	
	public int registerEmployee(EmployeeBo bo){
	 
		getJTObject.setTableName("employee");
		Map<String,Object> map = new HashMap();
		map.put("empno",bo.getEmpNo());
		map.put("empname", bo.getEmpName());
		map.put("job", bo.getJob());
		map.put("salary", bo.getSalary());
		map.put("deptno", bo.getDeptno());
	  
		
	  
	   return getJTObject.execute(map);
	
	}

}
