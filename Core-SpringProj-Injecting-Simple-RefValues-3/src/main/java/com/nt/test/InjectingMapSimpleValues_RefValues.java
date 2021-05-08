package com.nt.test;

import java.util.Date;
import java.util.Map;

public class InjectingMapSimpleValues_RefValues {
	
	
 private Map<Integer,String> employes;
 private Map<String,Date> impDates;
public InjectingMapSimpleValues_RefValues(Map<Integer, String> employes, Map<String, Date> impDates) {
	super();
	this.employes = employes;
	this.impDates = impDates;
}
@Override
public String toString() {
	return "InjectingMapSimpleValues_RefValues [employes=" + employes + ", impDates=" + impDates + "]";
}
 
 
 
	
	
	
	
	
	
	
	
	
	
	

}
