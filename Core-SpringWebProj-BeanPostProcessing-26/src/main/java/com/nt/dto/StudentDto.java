package com.nt.dto;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.nt.baseBeans.BaseBean;

@Component("sdto")
@Scope(scopeName = "prototype")
public class StudentDto extends BaseBean implements Serializable {
	
	int m1,m2,m3;
	
	
	

	public StudentDto() {
		System.out.println("StudentBo.0-param()");
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	@Override
	public String toString() {
		return "StudentBo [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getDoj()=" + getDoj() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
