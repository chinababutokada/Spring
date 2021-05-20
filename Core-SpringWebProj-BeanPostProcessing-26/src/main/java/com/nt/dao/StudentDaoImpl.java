package com.nt.dao;

import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBo;

@Repository("sDao")
public class StudentDaoImpl implements StudentDao {
	
	

	public StudentDaoImpl() {
		System.out.println("StudentDaoImpl.0-param()");
	}

	@Override
	public int registerStudent(StudentBo bo) {
	   
		System.out.println("StudentDaoImpl.registerStudent()");
		
		return 1;
	}

}
