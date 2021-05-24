package com.nt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.StudentDao;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	
	
	


	public List<Map<String, Object>> fetchAllStudents() {
		
		return studentDao.getAllEmployee();
		
	}
	
	public Map<String,Object> getStudentById(int no){
		
		return studentDao.getStudentById(no);
	}
    
	public int updateStudentById(int sno) {
		return studentDao.updateByStudentByid(sno);
	}
}
