package com.nt.bo;

public class EmployeeBo {
	
	private Integer empNo;
	private String empName;
	private String job;
	private Float salary;
	private String deptno;
	
	public EmployeeBo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "EmployeeBo [empNo=" + empNo + ", empName=" + empName + ", job=" + job + ", salary=" + salary
				+ ", deptno=" + deptno + "]";
	}

	
	
	
	
	

}
