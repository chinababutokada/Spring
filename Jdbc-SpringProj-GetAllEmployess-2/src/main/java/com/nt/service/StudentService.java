package com.nt.service;

import java.util.List;
import java.util.Map;

import com.nt.beans.StudentBo;
import com.nt.dao.StudentDao;

public class StudentService {
	
	private StudentDao dao = null;
	
	
	
	public StudentService(StudentDao dao) {
		super();
		this.dao = dao;
	}



	public List<Map<String, Object>> fetchAllStudents() {
		
		return dao.getAllEmployee();
		
	}
	
	public Map<String,Object> getStudentById(int no){
		
		return dao.getStudentById(no);
	}

}
