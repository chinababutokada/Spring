package com.nt.test;

import java.util.Arrays;
import java.util.Date;

public class InjectingArraySimpleValues_RefValues {
	
	private String[] emp_names;
	private Date[] datesList;
	
	
	public String[] getEmp_names() {
		return emp_names;
	}
	public void setEmp_names(String[] emp_names) {
		this.emp_names = emp_names;
	}
	public Date[] getDatesList() {
		return datesList;
	}
	public void setDatesList(Date[] datesList) {
		this.datesList = datesList;
	}
	
	
	@Override
	public String toString() {
		return "InjectingArraySimpleValues_RefValues [emp_names=" + Arrays.toString(emp_names) + ", datesList="
				+ Arrays.toString(datesList) + "]";
	}
	
	
	
	
	

}
