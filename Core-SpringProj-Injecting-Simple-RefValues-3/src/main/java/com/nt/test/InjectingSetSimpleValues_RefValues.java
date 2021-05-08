package com.nt.test;

import java.util.Date;
import java.util.Set;

public class InjectingSetSimpleValues_RefValues {
	
	private Set<String> emp_names;
	private Set<Date> datesList;
	@Override
	public String toString() {
		return "InjectingSetSimpleValues_RefValues [emp_names=" + emp_names + ", datesList=" + datesList + "]";
	}
	public InjectingSetSimpleValues_RefValues(Set<String> emp_names, Set<Date> datesList) {
		super();
		this.emp_names = emp_names;
		this.datesList = datesList;
	}
	
	
	
	
	
	
	
	
	
	
	

}
