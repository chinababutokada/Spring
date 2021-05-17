package com.nt.event;

import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class ContainerMonitoringLogics implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent e) {
		long start = 0;
		System.out.println("ContainerMonitoringLogics.onApplicationEvent()");
		
		
		if(e.toString().indexOf("RefreshedEvent")!=-1) {
		System.out.println("container started"+new Date());
			start = System.currentTimeMillis();
		}
		else if(e.toString().indexOf("ClosedEvent")!=-1) {
			System.out.println("container closed"+new Date());
			long end = System.currentTimeMillis(); 
			
			System.out.println("time taken:"+(end-start));
		}
		
		
		
		

	}

}
