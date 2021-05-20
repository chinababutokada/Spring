package com.nt.service;

import com.nt.dto.EmployeeDto;
import com.nt.dto.StudentDto;

public interface RegistrationService {
	
	public String empRegister(EmployeeDto dto);
	public String stdRegister(StudentDto dto);

}
