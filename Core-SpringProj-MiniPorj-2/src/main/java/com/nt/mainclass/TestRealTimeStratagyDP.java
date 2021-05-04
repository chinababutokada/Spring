package com.nt.mainclass;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.StudentController;
import com.nt.vo.StudentVO;

public class TestRealTimeStratagyDP {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		
		StudentVO vo = new StudentVO();
		vo.setSName("Nani");
		vo.setCource("Angular");
		vo.setFee("1000");
		System.out.println();
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/nt/resources/applicationContext.xml");
		
		StudentController controller = factory.getBean("controller",StudentController.class);
		
		System.out.println(controller.RegisterStudentDetails(vo));
		
		
		

	}

}
