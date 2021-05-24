package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBo;

@Repository
public class EmployeeDao {
	
	
	private JdbcTemplate jt;
	
	
	public EmployeeDao(@Autowired JdbcTemplate jt) {
		super();
		System.out.println("StudentDao.StudentDao()");
		this.jt = jt;
	}
	
	
	//Using Static inner Class
	/*public EmployeeBo getEmployeeById(int id) {
		
		final String  query = "Select EMPNO,EMPNAME,JOB,SALARY,DEPTNO from employee where empno=?";
		
		EmployeeBo bo = jt.queryForObject(query,
				                  new EmployeeRowMapper(),
				                  id
				                 );
		
		return bo;
		
	}*/
	
	 // using Annonymus inner class
      /*public EmployeeBo getEmployeeById(int id) {
		
		final String  query = "Select EMPNO,EMPNAME,JOB,SALARY,DEPTNO from employee where empno=?";
		
		EmployeeBo bo = jt.queryForObject(query,
				                  new RowMapper<EmployeeBo>() {

									@Override
									public EmployeeBo mapRow(ResultSet rs, int rowNum) throws SQLException {
										EmployeeBo bo = new EmployeeBo();
										bo.setEmpName(rs.getString("EMPNAME"));
										bo.setEmpNo(Integer.parseInt(rs.getString("EMPNO")));
										bo.setJob(rs.getString("JOB"));
										bo.setSalary(Float.parseFloat(rs.getString("SALARY")));
										
										return bo;
										
									}} ,
				                  id
				                 );
		
		return bo;
		
	   }*/
      //Using Lambda expression
     /* public EmployeeBo getEmployeeById(int id) {
  		
  		final String  query = "Select EMPNO,EMPNAME,JOB,SALARY,DEPTNO from employee where empno=?";
  		
  		EmployeeBo boo = jt.queryForObject(query,
  				                  (rs,row)->{
  				                	EmployeeBo bo = new EmployeeBo();
									bo.setEmpName(rs.getString("EMPNAME"));
									bo.setEmpNo(Integer.parseInt(rs.getString("EMPNO")));
									bo.setJob(rs.getString("JOB"));
									bo.setSalary(Float.parseFloat(rs.getString("SALARY")));
									
									return bo; 
  				                  } ,
  				                  id
  				                 );
  		
  		return boo;
  		
  	   }*/
	 public EmployeeBo getEmployeeById(int id) {
	  		
	  		final String  query = "Select EMPNO,EMPNAME,JOB,SALARYYY,DEPTNO from employee where empno=?";
	  		
	  		EmployeeBo boo = jt.queryForObject(query,
	  				                  new BeanPropertyRowMapper<>(EmployeeBo.class),
	  				                  id
	  				                 );
	  		
	  		return boo;
	  		
	  	   }
	
	private static class EmployeeRowMapper implements RowMapper<EmployeeBo>{

		@Override
		public EmployeeBo mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			EmployeeBo bo = new EmployeeBo();
			bo.setEmpName(rs.getString("EMPNAME"));
			bo.setEmpNo(Integer.parseInt(rs.getString("EMPNO")));
			bo.setJob(rs.getString("JOB"));
			bo.setSalary(Float.parseFloat(rs.getString("SALARY")));
			
			return bo;
		}

		
		
	}
	

}
