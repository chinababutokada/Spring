package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.store.OnlineStore;

/**
 * Hello world!
 *
 */
public class TestAfterReturning 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
        
        OnlineStore os = ac.getBean("os",OnlineStore.class);
       float billAmt =  os.shopping(new String[] {"jeans", "tshirs","inners"},new float[] {5000f,2000f,1000f});
       System.out.println("BillAmount:"+billAmt);
    }
}
