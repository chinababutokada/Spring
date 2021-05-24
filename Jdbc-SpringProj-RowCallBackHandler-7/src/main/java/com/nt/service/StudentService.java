package com.nt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.beans.StudentBo;
import com.nt.dao.StudentDao;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao dao = null;
	
	
	
	public StudentService() {
		System.out.println("StudentService.0 - Param");
	}



	public List<StudentBo> fetchAllStudents() {
		
		return dao.getAllEmployee();
		
	}
	
	public Map<String,Object> getStudentById(int no){
		
		return dao.getStudentById(no);
	}

}
