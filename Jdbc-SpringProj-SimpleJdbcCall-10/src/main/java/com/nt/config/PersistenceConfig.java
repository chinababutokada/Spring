package com.nt.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan("com.nt")
public class PersistenceConfig {
	
	private DataSource ds;
	
	
	@Bean
	public DataSource createDs() {
		
		HikariDataSource hkcp = new HikariDataSource();
		
		hkcp.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hkcp.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		hkcp.setUsername("nani");
		hkcp.setPassword("nani");
		
		return hkcp;
		
		
	}
	
	@Bean
	public SimpleJdbcCall getJTObject() {
		
		SimpleJdbcCall sjc = new SimpleJdbcCall(createDs());

		
		return sjc;
		
	}

}
