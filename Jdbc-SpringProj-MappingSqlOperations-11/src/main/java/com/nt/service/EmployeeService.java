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
		
		System.out.println("EmployeeService.0 -param");
	}
	
	
	
	public List<EmployeeBo> getEmployeeBySalRange(float min,float max) {
		return employeeDao.getEmployeesBasedOnSalaryRange(min, max);
	}
	
	public EmployeeBo getEmployeeByID(int empno){
		return employeeDao.getEmployeeByEmpNo(empno);
	}
	
	public Integer updateSal(float bonus,float salrange) {
		
		return employeeDao.updateSal(bonus, salrange);
	}
	

}
