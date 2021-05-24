package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.service.StudentService;

public class JDBCTemplateTest 
{
    public static void main( String[] args )
    {
       ApplicationContext ac = null;
       
       ac = new AnnotationConfigApplicationContext(AppConfig.class);
       
       
       StudentService service = ac.getBean("studentService",StudentService.class);
       
       System.out.println("Count: "+service.fetchAllStudents());
       System.out.println("Count: "+service.getStudentById(10004));
       System.out.println("Count: "+service.updateStudentById(10004));
       ((AbstractApplicationContext) ac).close();
       
    }
}
