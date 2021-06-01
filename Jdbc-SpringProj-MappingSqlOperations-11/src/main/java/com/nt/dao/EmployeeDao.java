package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBo;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;

@Repository
public class EmployeeDao {
	
	
	private static final String getEmployeesBySalRange="SELECT EMPNO,EMPNAME,JOB,SALARY,DEPTNO FROM EMPLOYEE WHERE SALARY>=? and SALARY<=?";
	private static final String getEmployeeByEmpId="SELECT EMPNO,EMPNAME,JOB,SALARY,DEPTNO FROM EMPLOYEE WHERE EMPNO=?";
	private static final String updateSal = "UPDATE EMPLOYEE SET SALARY=SALARY+? WHERE SALARY<?";
	
	private EmployeesBasedOnSalaryRange salRange;
	private EmployeeByEmpId empid;
	private UpdateSal usal;
	
	private EmployeeDao(@Autowired DataSource ds) {
		
		System.out.println("EmployeeDao Object Created and injected Data Source obj");
		
		salRange = new EmployeesBasedOnSalaryRange(ds,getEmployeesBySalRange);
		empid = new EmployeeByEmpId(ds, getEmployeeByEmpId);
		usal = new UpdateSal(ds, updateSal);
		
		
	}
	
	public List<EmployeeBo> getEmployeesBasedOnSalaryRange(float min,float max){
		System.out.println("EmployeeDao.getEmployeesBasedOnSalaryRange()");
		
		return salRange.execute(min,max);
		
	}
	
	
	private static class EmployeesBasedOnSalaryRange extends MappingSqlQuery<EmployeeBo>{
		
		public EmployeesBasedOnSalaryRange(DataSource ds, String query) {
			super(ds,query);
			System.out.println("EmployeeDao.EmployeesBasedOnSalaryRange.Inner Class Object Created()");
			super.declareParameter(new SqlParameter(Types.FLOAT));
			super.declareParameter(new SqlParameter(Types.FLOAT));
			super.compile();
			
		}
		
		@Override
		public EmployeeBo mapRow(ResultSet rs, int rowNum) throws SQLException {
			System.out.println("EmployeeDao.EmployeesBasedOnSalaryRange.mapRow()");
			EmployeeBo bo = new EmployeeBo();
			bo.setEmpNo(rs.getInt("EMPNO"));
			bo.setEmpName(rs.getString("EMPNAME"));
			bo.setJob(rs.getString("JOB"));
			bo.setSalary(rs.getFloat("SALARY"));
			bo.setDeptno(rs.getString("DEPTNO"));
			System.out.println("rowNum:"+rowNum);
			return bo;
		}

		
}// End EmployeesBasedOnSalaryRange
	
	public EmployeeBo getEmployeeByEmpNo(int empno) {
		
		return empid.findObject(empno);
		
	}
	
	 
	private class EmployeeByEmpId extends MappingSqlQuery<EmployeeBo>{
		
		public EmployeeByEmpId(DataSource ds,String query) {
			super(ds, query);
			System.out.println("EmployeeDao.EmployeeByEmpId object created");
			super.declareParameter(new SqlParameter(Types.INTEGER));
			super.compile();
			
		}


		@Override
		public EmployeeBo mapRow(ResultSet rs, int rowNum) throws SQLException {
			System.out.println("EmployeeDao.EmployeeByEmpId.mapRow()");
			EmployeeBo bo = new EmployeeBo();
			bo.setEmpNo(rs.getInt("EMPNO"));
			bo.setEmpName(rs.getString("EMPNAME"));
			bo.setJob(rs.getString("JOB"));
			bo.setSalary(rs.getFloat("SALARY"));
			bo.setDeptno(rs.getString("DEPTNO"));
			System.out.println("rowNum:"+rowNum);
			return bo;
		}
		
	}
	
	public Integer updateSal(float bonus,float salrange) {
		return usal.update(bonus,salrange);
		
	}
	private class UpdateSal extends SqlUpdate{

		public UpdateSal(DataSource ds,String query) {
			super(ds, query);
			System.out.println("EmployeeDao.UpdateSal.Inner class object created()");
			super.declareParameter(new SqlParameter(Types.FLOAT) );
			super.declareParameter(new SqlParameter(Types.FLOAT) );
			super.compile();
		}
		
	}
}
