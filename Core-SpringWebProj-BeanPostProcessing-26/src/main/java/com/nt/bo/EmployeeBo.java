package com.nt.bo;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.nt.baseBeans.BaseBean;

@Component
@Scope("prototype") 
public class EmployeeBo extends BaseBean {
	
	private float gsalary;
	private float nSalary;
	public EmployeeBo() {
		System.out.println("EmployeeBo.0 param ()");
	}
	@PostConstruct
	public void myInit() {
		System.out.println("EmployeeBo.myInit()");
	}
	public float getGsalary() {
		return gsalary;
	}
	public void setGsalary(float gsalary) {
		this.gsalary = gsalary;
	}
	public float getnSalary() {
		return nSalary;
	}
	public void setnSalary(float nSalary) {
		this.nSalary = nSalary;
	}
	@Override
	public String toString() {
		return "EmployeeBo [gsalary=" + gsalary + ", nSalary=" + nSalary + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getDoj()=" + getDoj() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	

}
