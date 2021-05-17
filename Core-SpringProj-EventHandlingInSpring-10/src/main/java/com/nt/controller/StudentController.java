package com.nt.controller;

import org.springframework.beans.BeanUtils;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;
import com.nt.vo.StudentVO;

public class StudentController {
	
	private StudentService service;
	
	
	
	public StudentController(StudentService service) {
		super();
		this.service = service;
	}



	public String RegisterStudentDetails(StudentVO vo) {
		
		boolean status =false;
		StudentDTO dto = new StudentDTO();
		BeanUtils.copyProperties(vo, dto);
		dto.setFee(Integer.parseInt(vo.getFee()));
		status = service.incertStudentData(dto);
		if(status)
			return "Sucessfully Registered";
		else
			return "Registration Failed";
			
		
		
		
		
	} 
	

}
