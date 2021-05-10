package com.nt;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		/*
		 * Class c = Class.forName(args[0]); Object obj = c.newInstance(); Date d =
		 * (Date) obj; System.out.println("Date:"+d);
		 */
	    Class c1 = Class.forName(args[0]);
	    Constructor[] con = c1.getDeclaredConstructors();
	    con[0].setAccessible(true);
		 
           Demo d1  = (Demo)con[0].newInstance(10,20);
           System.out.println("d1:"+d1);
	}



	
	
	
}
