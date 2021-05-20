package com.nt.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.config.AppConfig;
import com.nt.controller.StudentController;
import com.nt.vo.StudentVO;

public class TestRealTimeStratagyDP {

	public static void main(String[] args) {
		
		ApplicationContext ac = null;
		ac = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentVO vo = new StudentVO();
		vo.setSName("Nani");
		vo.setCource("Angular");
		vo.setFee("20000");
		System.out.println();
		
	
		StudentController controller = ac.getBean("controller",StudentController.class);
		
		System.out.println(controller.RegisterStudentDetails(vo));
        ((AbstractApplicationContext) ac).close();
	}

}
