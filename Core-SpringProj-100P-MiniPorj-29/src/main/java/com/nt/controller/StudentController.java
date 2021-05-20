package com.nt.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;
import com.nt.vo.StudentVO;

@Component("controller")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	
	
	



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
