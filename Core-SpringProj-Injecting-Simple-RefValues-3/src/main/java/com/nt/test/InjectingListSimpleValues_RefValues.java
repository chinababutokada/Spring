package com.nt.test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class InjectingListSimpleValues_RefValues {
	
	private List<String> emp_names;
	private List<Date> datesList;
	public InjectingListSimpleValues_RefValues(List<String> emp_names, List<Date> datesList) {
		super();
		this.emp_names = emp_names;
		this.datesList = datesList;
	}
	@Override
	public String toString() {
		return "InjectingListSimpleValues_RefValues [emp_names=" + emp_names + ", datesList=" + datesList + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
