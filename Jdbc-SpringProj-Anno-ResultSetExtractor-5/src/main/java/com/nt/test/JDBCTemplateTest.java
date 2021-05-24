package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bo.StudentDto;
import com.nt.service.StudentService;

public class JDBCTemplateTest 
{
    public static void main( String[] args )
    {
       ApplicationContext ac = null;
       
       ac = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
       
       
       StudentService service = ac.getBean("studentService",StudentService.class);
       List<StudentDto> listDto = service.fetchStudentsByCourse("Angular", "Ajile");
       
       listDto.forEach(dto->{
    	   System.out.println("Result: "+dto);
       });
       
       
       ((AbstractApplicationContext) ac).close();
       
    }
}
