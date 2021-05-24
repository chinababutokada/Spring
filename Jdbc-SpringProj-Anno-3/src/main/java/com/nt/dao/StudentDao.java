package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	
	
	private JdbcTemplate jt;
	
	
	public StudentDao(@Autowired JdbcTemplate jt) {
		super();
		System.out.println("StudentDao.StudentDao()");
		this.jt = jt;
	}
	
	public int getEmployessCount() {
		
		final String  query = "SELECT count(*) FROM STUDENT";
		
		
		return jt.queryForObject(query, Integer.class);
		
	}
	

}
