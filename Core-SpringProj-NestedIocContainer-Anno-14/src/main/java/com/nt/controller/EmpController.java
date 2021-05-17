package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.nt.dto.EmployeeDto;
import com.nt.service.EmployeeService;
import com.nt.vo.EmployeeVo;

@Controller
public class EmpController {
	
	@Autowired
	private EmployeeService service;
	@Value("${age}")
    private int age;
	
	public List<EmployeeVo> getEmpList(){
		
		System.out.println("age:"+age);
		List<EmployeeDto> listDto = service.getEmpList();
		List<EmployeeVo> listVo = new ArrayList<>();
		for(EmployeeDto dto : listDto) {
			
			EmployeeVo vo = new EmployeeVo();
			BeanUtils.copyProperties(dto, vo);
			vo.setDeptNo(String.valueOf(dto.getDeptNo()));
			vo.setEmpNo(String.valueOf(dto.getEmpNo()));
			vo.setSalary(String.valueOf(dto.getSalary()));
			
			listVo.add(vo);
			
		}
		return listVo;
		
		
	}
}
