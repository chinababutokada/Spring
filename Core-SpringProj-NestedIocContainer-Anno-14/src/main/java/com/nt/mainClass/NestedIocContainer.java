package com.nt.mainClass;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.EmpController;
import com.nt.vo.EmployeeVo;

public class NestedIocContainer {

	public static void main(String[] args) {
	
		ApplicationContext parent = null,child=null;
		
		parent = new ClassPathXmlApplicationContext("com/nt/cfgs/business.xml");
		
		
		
		child = new ClassPathXmlApplicationContext(new String[] {"com/nt/cfgs/presentation.xml"},parent);
		
		EmpController controller = child.getBean("empController",EmpController.class);
		                                        
		List<EmployeeVo> listvo = controller.getEmpList();
		
		for(EmployeeVo vo : listvo) {
			
			System.out.println("Student"+vo);
		}
		
		((AbstractApplicationContext) child).close();
		
		
		
	}

}
