package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.StudentBo;
import com.nt.service.StudentService;

public class JDBCTemplateTest 
{
    public static void main( String[] args )
    {
       ApplicationContext ac = null;
       
       ac = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
       
       
       StudentService service = ac.getBean("studentService",StudentService.class);
       
       //System.out.println("Count: "+service.fetchAllStudents());
       
       List<StudentBo> listbo = service.fetchAllStudents();
       
       listbo.forEach(bo->System.out.println(bo));
       ((AbstractApplicationContext) ac).close();
       
    }
}
