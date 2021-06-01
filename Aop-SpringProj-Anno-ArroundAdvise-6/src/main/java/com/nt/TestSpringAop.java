package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.IIntrestCalc;


public class TestSpringAop 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = null;
        
        ac = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
        
        IIntrestCalc proxy = ac.getBean("intrestCalc", IIntrestCalc.class);
        System.out.println(proxy.calcSimpleIntrest(10000f, 2, 12));
        
        System.out.println("proxy:"+proxy.getClass()+"..."+proxy.getClass().getSuperclass()+"--"+proxy.hashCode());
        System.out.println("==========================================================");
           System.out.println(proxy.calcCompoundIntrest(10000f, 2, 12));
        
        System.out.println("proxy:"+proxy.getClass()+"..."+proxy.getClass().getSuperclass()+"--"+proxy.hashCode());
        System.out.println(">>>>>.>>>>>>>>>>>>>>");
        System.out.println(proxy.calcSimpleIntrest(10000f, 2, 12));
        System.out.println(">>>>>.>>>>>>>>>>>>>>");
        System.out.println(proxy.calcCompoundIntrest(10000f, 2, 12));
        
        ((AbstractApplicationContext) ac).close();
    }
}
