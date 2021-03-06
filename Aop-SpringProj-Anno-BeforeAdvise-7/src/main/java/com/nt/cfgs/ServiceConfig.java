package com.nt.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.nt.service","com.nt.aspect"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ServiceConfig {

}
