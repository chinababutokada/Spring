package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.dto.EmployeeDto;
import com.nt.service.EmployeeService;
import com.nt.vo.EmployeeVo;

public class EmpController {
	
	private EmployeeService service;

	public EmpController(EmployeeService service) {
		super();
		this.service = service;
	}
    
	public List<EmployeeVo> getEmpList(){
		
		
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
