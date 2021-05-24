package com.nt.service;

import com.nt.dao.StudentDao;

public class StudentService {
	
	private StudentDao dao = null;
	
	
	
	public StudentService(StudentDao dao) {
		super();
		this.dao = dao;
	}



	public int fetchStudentCount() {
		
		return dao.getEmployessCount();
		
	}

}
