package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.dto.UserInfo;

public class AuthenticationManagerDaoImpl implements AuthendicationManagerDao {
     
	private JdbcTemplate jt;
	
	
	public AuthenticationManagerDaoImpl(JdbcTemplate jt) {
		super();
		this.jt = jt;
	}

	
	@Override
	public int authenticate(UserInfo info) {
	   final String authentication="SELECT count(*) as count from userinfo where username=? and password=?";
		
	   
	   return jt.queryForObject(authentication, Integer.class,info.getUserName(),info.getPassword());
	}

}
