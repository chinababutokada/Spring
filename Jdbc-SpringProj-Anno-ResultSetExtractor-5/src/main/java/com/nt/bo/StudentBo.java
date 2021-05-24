package com.nt.bo;

public class StudentBo {
	
	private Integer sNo;
	private String sName;
	private String course;
	private Float fee;
	
	public StudentBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getsNo() {
		return sNo;
	}

	public void setsNo(Integer sNo) {
		this.sNo = sNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Float getFee() {
		return fee;
	}

	public void setFee(Float fee) {
		this.fee = fee;
	}

	
	@Override
	public String toString() {
		return "StudentBo [sNo=" + sNo + ", sName=" + sName + ", course=" + course + ", fee=" + fee + "]";
	}
	
	
	
	
}
