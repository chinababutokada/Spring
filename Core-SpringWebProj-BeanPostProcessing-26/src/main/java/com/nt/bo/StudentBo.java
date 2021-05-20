package com.nt.bo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.nt.baseBeans.BaseBean;

@Component
@Scope(scopeName = "prototype")
public class StudentBo extends BaseBean{
	
	private int total;
	private float avg;
	
	public StudentBo() {
		System.out.println("StudentBo.0 - param()");
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "StudentBo [total=" + total + ", avg=" + avg + "]";
	}
	
	

}
