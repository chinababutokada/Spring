package com.nt.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.StudentController;
import com.nt.vo.StudentVO;

public class TestRealTimeStratagyDP {

	public static void main(String[] args) {
		
		ApplicationContext ac =null;
		
		ac = new ClassPathXmlApplicationContext("com/nt/resources/applicationContext.xml");
        StudentController controller = ac.getBean("controller",StudentController.class);
        StudentVO vo = new StudentVO();
        vo.setCource("Ajile");
        vo.setFee("5000");
        vo.setSName("raja");
        
        String result = controller.RegisterStudentDetails(vo);
        System.out.println("RESULT:"+result);
	}

}
