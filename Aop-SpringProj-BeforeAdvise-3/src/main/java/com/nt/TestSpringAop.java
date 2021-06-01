package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dao.BankServicesDao;
import com.nt.service.BankAccountServiceManager;
import com.nt.service.IAuthenticateManagerService;


public class TestSpringAop 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = null;
        
        ac = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
        
        BankAccountServiceManager bankService= ac.getBean("bankService",BankAccountServiceManager.class);
        
        IAuthenticateManagerService authService = ac.getBean("authService",IAuthenticateManagerService.class);
        
        authService.signIn("raja", "ranii");
        System.out.println("Result1:"+bankService.depositAmount(123l, 2000f));
        System.out.println("Result2:"+bankService.withDrawAmount(1346l, 1000f));
        ((AbstractApplicationContext) ac).close();
    }
}
