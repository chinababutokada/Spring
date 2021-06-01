package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.ISimpleCalc;
import com.nt.beans.SimpleCalcIntrest;

public class TestSpringAop 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = null;
        
        ac = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
        
        ISimpleCalc proxy = ac.getBean("proxy", ISimpleCalc.class);
        System.out.println(proxy.calcSimpleIntrest(10000f, 2, 12));
        
        System.out.println("proxy:"+proxy.getClass()+"..."+proxy.getClass().getSuperclass());
        
        ((AbstractApplicationContext) ac).close();
    }
}
