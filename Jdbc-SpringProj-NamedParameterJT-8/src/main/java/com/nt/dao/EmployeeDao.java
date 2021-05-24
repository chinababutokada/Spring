package com.nt.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBo;

@Repository
public class EmployeeDao {
	
	@Autowired
	private NamedParameterJdbcTemplate getJTObject;

	public EmployeeDao() {
		super();
		System.out.println("EmployeeDao.0 - param()");
	}
	
	public String getNameByEmpNo(int empNo) {
		
		final String sql = "select empname from employee where empno=:eno";
		Map<String,Object> paramMap = new HashMap<>();
		
		paramMap.put("eno", empNo);
		
		return getJTObject.queryForObject(sql, paramMap, String.class);
		
	}
	
	public List<EmployeeBo> getEmployeeByID(int empno) {
		
		final String sql = "select empno,empname,job,salary from employee where empno=:eno";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		
		paramSource.addValue("eno", empno);
		List<EmployeeBo> listBo = new ArrayList<>();
		getJTObject.query(sql, paramSource, rs->{
			EmployeeBo bo = new EmployeeBo();
			bo.setEmpNo(Integer.parseInt(rs.getString("empno")));
			bo.setEmpName(rs.getString("empname"));
			bo.setJob(rs.getString("job"));
			bo.setSalary(Float.parseFloat(rs.getString("salary")));
			listBo.add(bo);
			
			
		});
		
		return listBo;
		
	}
	
	public int registerEmployee(EmployeeBo bo){
		
	  final String sql = "insert into employee(empno,empname,job,salary,deptno) values (:empNo,:empName,:job,:salary,:deptno)";
	  
	  SqlParameterSource paramSource = new BeanPropertySqlParameterSource(bo);
	  
	  
	   return getJTObject.update(sql, paramSource);
	
	}

}
