package com.nt.cfgs;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan("com.nt.dao")
public class PersistenceConfig {

	@Bean
	public DataSource createDs() {
		HikariDataSource ds = null;
		
		ds = new HikariDataSource();
		ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("nani");
		ds.setPassword("nani");
		
		return ds;
		
	}
	
	@Bean
	public JdbcTemplate getJT() {
		
		JdbcTemplate jt = null;
		jt = new JdbcTemplate();
		jt.setDataSource(createDs());
		return jt;
	}
}
