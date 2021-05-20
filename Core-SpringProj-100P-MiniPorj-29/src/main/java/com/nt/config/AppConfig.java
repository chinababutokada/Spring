package com.nt.config;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.nt")
@PropertySource("classpath:/com/nt/properties/jdbc.properties")
public class AppConfig {
	
	@Autowired
	private Environment env; 
	
    
    
    
    @Bean("ds")
	public DataSource createDs() {
		System.out.println("AppConfig.createDs()");
		HikariDataSource ds = new HikariDataSource();
		ds.setDriverClassName(env.getRequiredProperty("jdbc.driverClass"));
		ds.setJdbcUrl(env.getRequiredProperty("jdbc.url"));
		ds.setUsername(env.getRequiredProperty("jdbc.user"));
		ds.setPassword(env.getRequiredProperty("jdbc.password"));
		ds.setMaximumPoolSize(Integer.parseInt(env.getRequiredProperty("jdbc.maxPSize")));
		ds.setMinimumIdle(Integer.parseInt(env.getRequiredProperty("jdbc.minIdle")));
		ds.setConnectionTimeout(Long.parseLong(env.getRequiredProperty("jdbc.conTimeOut")));
		
		
		return (DataSource) ds;
	
	}

}
