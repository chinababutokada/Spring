package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.StudentService;

public class JDBCTemplateTest 
{
    public static void main( String[] args )
    {
       ApplicationContext ac = null;
       
       ac = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
       
       
       StudentService service = ac.getBean("com.nt.service.StudentService",StudentService.class);
       
       System.out.println("Count: "+service.fetchStudentCount());
       
       ((AbstractApplicationContext) ac).close();
       
    }
}
