package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBo;

@Repository
public class EmployeeDao {
	
	@Autowired
	private DataSource ds ;

	
	public List<EmployeeBo> getEmployees(){
		
		 final String GETEMPLOYEES_QUERY="SELECT EMPNO,EMPNAME,JOB,SALARY,DEPTNO FROM EMPLOYEE";
		
		 Connection con = null;
		 PreparedStatement ps = null;
		 ResultSet rs = null;
		 EmployeeBo bo = null;
		 List<EmployeeBo> list = null;
		 try {
			con = ds.getConnection();
			ps = con.prepareStatement(GETEMPLOYEES_QUERY);
			rs = ps.executeQuery();
			
			list = new ArrayList<>();
			while(rs.next()) {
				bo = new EmployeeBo();
				bo.setEmpNo(Long.parseLong(rs.getString("EMPNO")));
				bo.setEmpName(rs.getString("EMPNAME"));
				bo.setJob(rs.getString("JOB"));
				bo.setSalary(Double.parseDouble(rs.getString("SALARY")));
				bo.setDeptNo(Integer.parseInt(rs.getString("DEPTNO")));
				
		        list.add(bo);
				
			}
		 }
		 catch(Exception e)
		 {
			e.printStackTrace();
		 }
		  
		
		
		
		
		return list;
		
		
		
	}
	
	

}
