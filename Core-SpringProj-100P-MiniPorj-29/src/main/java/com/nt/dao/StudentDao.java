package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;

@Repository("dao")
public class StudentDao {
	
	@Autowired
	private DataSource ds =null;

	
	public int registerStudent(StudentBO bo) {
		String QUERY = "insert into student(SNo,sname,course,fee) values(SERIALNUMBER.nextval,?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		int result=0;
		
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(QUERY);
			ps.setString(1, bo.getSName());
			ps.setString(2, bo.getCource());
			ps.setFloat(3, bo.getFee());
			
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return result;
		
	}
	
	
	

}
