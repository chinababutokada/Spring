package com.nt.cfgs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.nt.dao")
@PropertySource(value = "com/nt/commons/jdbc.properties")
public class PersistenceConfig {
	
	@Autowired
	private Environment env;
	
	@Bean("ds")
	public DataSource getDs() {
		
		HikariDataSource ds = new HikariDataSource();
		ds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		ds.setJdbcUrl(env.getRequiredProperty("jdbc.url"));
		ds.setUsername(env.getRequiredProperty("jdbc.username"));
		ds.setPassword(env.getRequiredProperty("jdbc.password"));
		ds.setConnectionTimeout(Long.parseLong(env.getRequiredProperty("jdbc.connectionTimeout")));
		
		
		
		return ds;
		
	}
	@Bean("jt")
	public JdbcTemplate getJt() {
	
		return new JdbcTemplate(getDs());
		
	}

}
