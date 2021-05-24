package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.nt.beans.StudentBo;

@Repository
public class StudentDao {
	
	@Autowired
	private JdbcTemplate jt;

	public StudentDao() {
		System.out.println("StudentDao.0 - Param");
	}
	 
	public List<StudentBo> getAllEmployee(){
		
		final String query = "SELECT SNO,SNAME,COURSE,FEE FROM STUDENT";
		List<StudentBo> list = new ArrayList<>();
		
		                                jt.query(query,
				                           
				                         new RowCallbackHandler() {
											
											@Override
											public void processRow(ResultSet rs) throws SQLException {
												System.out.println("StudentDao.getAllEmployee().new RowCallbackHandler() {...}.processRow()");
												StudentBo bo = new StudentBo();
												bo.setSno(Integer.parseInt(rs.getString("SNO")));
												bo.setSname(rs.getString("SNAME"));
												bo.setCourse(rs.getString("COURSE"));
												bo.setFee(Float.parseFloat(rs.getString("FEE")));
												list.add(bo);
											}
										}
				                          
			                            );
		
		
		
		
		
		
		return list;
		
		
		
		
		
	}
	
	public Map<String,Object> getStudentById(int no) {
		
		
		final String Query = "SELECT SNO,SNAME,COURSE,FEE FROM STUDENT WHERE SNO=?";
		
		Map<String,Object> map = jt.queryForMap(Query,no);
		
		return map;
		
		
		
	}

}
