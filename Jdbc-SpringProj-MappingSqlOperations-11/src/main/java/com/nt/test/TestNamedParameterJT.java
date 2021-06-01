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
        
        service.getEmployeeBySalRange(10000, 15000).forEach(System.out::println);
        System.out.println("----------------------------------------------------");
        System.out.println(service.getEmployeeByID(106));
        System.out.println("----------------------------------------------------");
        System.out.println("Result : "+service.updateSal(2000f, 10000f));
        ((AbstractApplicationContext) ac).close();
        
    }
}
