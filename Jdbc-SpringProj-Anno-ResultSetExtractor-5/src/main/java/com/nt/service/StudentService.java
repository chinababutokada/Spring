package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.StudentBo;
import com.nt.bo.StudentDto;
import com.nt.dao.StudentDao;

@Service
public class StudentService {
	
	private StudentDao dao = null;
	
	
	
	public StudentService(@Autowired StudentDao dao) {
		
		super();
		System.out.println("StudentService.StudentService()");
		this.dao = dao;
	}



	public List<StudentDto> fetchStudentsByCourse(String cource1,String cource2) {
		
		List<StudentBo> listBo = dao.getStudentdsByCource(cource1, cource2);
		List<StudentDto> ListDto = new ArrayList<>();
		listBo.forEach(bo->{
			StudentDto dto = new StudentDto();
			BeanUtils.copyProperties(bo, dto);
			dto.setSerialNo(listBo.size()+1);
			ListDto.add(dto);
			
			
		});
		
		return ListDto;
		
		
		
	}

}
