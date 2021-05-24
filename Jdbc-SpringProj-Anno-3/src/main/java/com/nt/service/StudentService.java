package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.StudentDao;

@Service
public class StudentService {
	
	private StudentDao dao = null;
	
	
	
	public StudentService(@Autowired StudentDao dao) {
		
		super();
		System.out.println("StudentService.StudentService()");
		this.dao = dao;
	}



	public int fetchStudentCount() {
		
		return dao.getEmployessCount();
		
	}

}
