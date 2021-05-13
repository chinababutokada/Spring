package com.nt.dp;

public class Printer {
	
	private static Printer printer;
	private static boolean ISINSTANCED =false;
	
	private Printer() {
		System.out.println("Printer.Printer()");
		if(!ISINSTANCED)
			ISINSTANCED = true;
		else {
			throw new InstantiationError();
		}
	}
   public static Printer getInstance(){
	   System.out.println("Printer.enclosing_method()");
	   
	   if(printer==null)
		   printer = new Printer();
	   
	   return printer;
	   
	   
   }
}
