package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDao;
import com.nt.dto.StudentDTO;

public class StudentService {
	
	private StudentDao dao;

	public StudentService(StudentDao dao) {
		super();
		this.dao = dao;
	}
	
	
	public boolean incertStudentData(StudentDTO dto) {
		
		StudentBO bo = new StudentBO();
		BeanUtils.copyProperties(dto, bo);
		int res = 0;
		boolean isRegistered = false;
		res = dao.registerStudent(bo);
		if(res!=0)
		isRegistered = true;
		
		
		
		return isRegistered;
		
	}
	

}
