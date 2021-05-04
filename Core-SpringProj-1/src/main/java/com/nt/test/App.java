package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Resource res = null;
        BeanFactory factory = null;
//        res = new FileSystemResource("src/main/java/com/nt/resorces/applicationContext.xml");
        res = new ClassPathResource("com/nt/resorces/applicationContext.xml");
        factory = new XmlBeanFactory(res);
//        WishMsgGenerator wmg = (WishMsgGenerator)factory.getBean("wmg");
        WishMsgGenerator wmg = factory.getBean("wmg",WishMsgGenerator.class);
        System.out.println(wmg.generateWishMsg("Nani"));
        
    }
}
