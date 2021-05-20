package com.nt.baseBeans;

import java.time.LocalDate;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public abstract class BaseBean {
	
	private int id;
	private String name;
	private LocalDate doj;
	
	

	
	public BaseBean() {
		super();
		System.out.println("BaseBean-0 Param");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "BaseBean [id=" + id + ", name=" + name + ", doj=" + doj + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ",   ]";
	}
	
	
	

}
