package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBo;
import com.nt.dao.EmployeeDao;
import com.nt.dto.EmployeeDto;

public class EmployeeService {
	
	
	private EmployeeDao empDao;

	public EmployeeService(EmployeeDao empDao) {
		super();
		System.out.println("EmployeeService.EmployeeService()");
		
		this.empDao = empDao;
	}
	
	public List<EmployeeDto> getEmpList(){
		
		List<EmployeeBo> listbo = null;
		
		listbo = empDao.getEmployees();
		List<EmployeeDto> listDto = new ArrayList<>();
		for(EmployeeBo bo : listbo) {
		  EmployeeDto dto = new EmployeeDto();
		  BeanUtils.copyProperties(bo, dto);
		  
		  listDto.add(dto);
			
		}
		
		return listDto;
		
	}
	

}
