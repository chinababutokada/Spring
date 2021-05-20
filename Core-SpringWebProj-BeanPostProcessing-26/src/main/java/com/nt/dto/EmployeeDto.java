package com.nt.dto;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.nt.baseBeans.BaseBean;

@Component("edto")
@Scope(scopeName = "prototype")
public class EmployeeDto extends BaseBean implements Serializable{
	
	private float salary;
	
	@PostConstruct
	public void myInit() {
		System.out.println("EmployeeDto.myInit()");
	}

	public EmployeeDto() {
		System.out.println("EmployeeDto.0 param()");
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDto [salary=" + salary + ", getId()=" + getId() + ", getName()=" + getName() + ", getDoj()="
				+ getDoj() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	

}
