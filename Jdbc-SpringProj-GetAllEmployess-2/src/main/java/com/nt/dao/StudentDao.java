package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.beans.StudentBo;

public class StudentDao {
	
	private JdbcTemplate jt;

	public StudentDao(JdbcTemplate jt) {
		super();
		this.jt = jt;
	}
	 
	public List<Map<String, Object>> getAllEmployee(){
		
		final String query = "SELECT SNO,SNAME,COURSE,FEE FROM STUDENT";
		
		List<Map<String, Object>> boList = jt.queryForList(query);
		
		
		return boList;
		
	}
	
	public Map<String,Object> getStudentById(int no) {
		
		
		final String Query = "SELECT SNO,SNAME,COURSE,FEE FROM STUDENT WHERE SNO=?";
		
		Map<String,Object> map = jt.queryForMap(Query,no);
		
		return map;
		
		
		
	}

}
