package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBo;
import com.nt.bo.StudentBo;
import com.nt.dao.EmployeeDao;
import com.nt.dao.StudentDao;
import com.nt.dto.EmployeeDto;
import com.nt.dto.StudentDto;

@Service("service")
public abstract class ServiceRegisterImpl implements RegistrationService {

	 @Autowired
	 private StudentDao sDao;
	 @Autowired
	 private EmployeeDao eDao;
	 
	 @Lookup
	 public abstract StudentBo getStdInstance();
	 
	 @Lookup
	 public abstract EmployeeBo getEmpInstance();
	 
	 
	
	
	public ServiceRegisterImpl() {
		System.out.println("Service"+this.getClass().getName()+"...."+this.getClass().getSuperclass().getName());
	}

	@Override
	public String empRegister(EmployeeDto dto) {
		
		EmployeeBo bo = null;
		float gSal = dto.getSalary()*2;
		float nSal = dto.getSalary()/2;
		
		bo = getEmpInstance();
		bo.setGsalary(gSal);
		bo.setnSalary(nSal);
		BeanUtils.copyProperties(dto, bo);
		
		int result = eDao.registerEmployee(bo);
		System.out.println(bo);
		return result>0?"Employee registered sucessfully":"Employee registration failed";
	}

	@Override
	public String stdRegister(StudentDto dto) {
		StudentBo bo = null;
		int m1 = 0,m2=0,m3=0;
		m1 = dto.getM1();
		m2 = dto.getM2();
		m3= dto.getM3();
		int total = m1+m2+m3;
		float avg = total/3;
		bo = getStdInstance();
		bo.setAvg(avg);
		bo.setTotal(total);
		BeanUtils.copyProperties(dto, bo);
		
		int result = sDao.registerStudent(bo);
		System.out.println(bo);
		return result>0?"Student registered sucessfully":"Student registration failed";
	}

}
