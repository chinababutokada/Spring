package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {
	
	private JdbcTemplate jt;

	public StudentDao(JdbcTemplate jt) {
		super();
		this.jt = jt;
	}
	
	public int getEmployessCount() {
		
		final String  query = "SELECT count(*) FROM STUDENT";
		
		
		return jt.queryForObject(query, Integer.class);
		
	}
	

}
