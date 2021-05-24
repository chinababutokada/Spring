package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBo;
import com.nt.dao.EmployeeDao;

@Service
public class StudentService {
	
	private EmployeeDao dao = null;
	
	
	
	public StudentService(@Autowired EmployeeDao dao) {
		
		super();
		System.out.println("StudentService.StudentService()");
		this.dao = dao;
	}



	public EmployeeBo fetchStudentById(int id) {
		
		
		return dao.getEmployeeById(id);
		
	}

}
