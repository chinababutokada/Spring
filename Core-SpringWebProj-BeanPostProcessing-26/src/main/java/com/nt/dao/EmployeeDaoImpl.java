package com.nt.dao;

import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBo;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	

	public EmployeeDaoImpl() {
		System.out.println("EmployeeDaoImpl.0-param()");
	}

	
	@Override
	public int registerEmployee(EmployeeBo bo) {
	
		System.out.println("EmployeeDaoImpl.registerEmployee()");
		return 1;
	}

}
