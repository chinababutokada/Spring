package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	
	@Autowired
	private JdbcTemplate getJT ;

	
	 
	public List<Map<String, Object>> getAllEmployee(){
		
		final String query = "SELECT SNO,SNAME,COURSE,FEE FROM STUDENT";
		
		List<Map<String, Object>> boList = getJT.queryForList(query);
		
		
		return boList;
		
	}
	
	public Map<String,Object> getStudentById(int no) {
		
		
		final String Query = "SELECT SNO,SNAME,COURSE,FEE FROM STUDENT WHERE SNO=?";
		
		Map<String,Object> map = getJT.queryForMap(Query,no);
		
		return map;
		
		
		
	}
	
	public int updateByStudentByid(int sno) {
		
		final String query = "update STUDENT set sname='Mani' where sno=?";
		
		return getJT.update(query,sno);
		
		
	}

}
