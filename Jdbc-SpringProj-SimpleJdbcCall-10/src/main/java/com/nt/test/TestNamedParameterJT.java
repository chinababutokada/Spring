package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.bo.EmployeeBo;
import com.nt.config.AppConfig;
import com.nt.service.EmployeeService;

public class TestNamedParameterJT 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = null;
        
        ac = new AnnotationConfigApplicationContext(AppConfig.class);
        
        EmployeeService service = ac.getBean("employeeService",EmployeeService.class);
        
        
       
        System.out.println(service.CheckAuth("raja", "rani"));
        ((AbstractApplicationContext) ac).close();
        
    }
}
