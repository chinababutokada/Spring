package com.nt.beans;

public class StudentBo {
	
	private int sno;
	private String sname;
	private String course;
	private float fee;
	
	
	
	public StudentBo() {
		super();
		
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	
	@Override
	public String toString() {
		return "StudentBo [sno=" + sno + ", sname=" + sname + ", course=" + course + ", fee=" + fee + "]";
	}
	
	

}
