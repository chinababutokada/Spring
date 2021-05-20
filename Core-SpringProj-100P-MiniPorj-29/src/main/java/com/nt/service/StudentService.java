package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDao;
import com.nt.dto.StudentDTO;

@Service("service")
public class StudentService {
	
	@Autowired
	private StudentDao dao;

	
	
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
