package com.nt.bpp;

import java.time.LocalDate;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.nt.baseBeans.BaseBean;

@Component
public class DojIntializer implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	System.out.println("DojIntializer.postProcessBeforeInitialization()");
	if(bean instanceof BaseBean) {
	 System.out.println("DojIntializer. if ()");
		((BaseBean) bean).setDoj(LocalDate.now());
	}
	
		return bean;
	}
    
	
}
