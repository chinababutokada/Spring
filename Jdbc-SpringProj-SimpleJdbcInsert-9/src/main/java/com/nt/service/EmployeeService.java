package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBo;
import com.nt.dao.EmployeeDao;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	public EmployeeService() {
		super();
		System.out.println("EmployeeService.0 -param");
	}
	
	
	
	public int insertEmployee(EmployeeBo bo) {
		return employeeDao.registerEmployee(bo);
	}
	

}
