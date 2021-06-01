package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.service.BankAccountServiceManager;
import com.nt.service.IAuthenticateManagerService;


public class TestSpringAop 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = null;
        
        ac = new AnnotationConfigApplicationContext(AppConfig.class);
        
        BankAccountServiceManager bankService= ac.getBean("bankService",BankAccountServiceManager.class);
        
        IAuthenticateManagerService authService = ac.getBean("authService",IAuthenticateManagerService.class);
        
        authService.signIn("raja", "rani");
        System.out.println(bankService.getClass()+"..."+bankService.getClass().getSuperclass()+"<<<"+bankService.getClass().getInterfaces());
        System.out.println("Result1:"+bankService.depositAmount(123l, 2000f));
        System.out.println("Result2:"+bankService.withDrawAmount(1346l, 1000f));
        ((AbstractApplicationContext) ac).close();
    }
}
