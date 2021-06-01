package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.dto.UserInfo;

@Repository("authDao")
public class AuthenticationManagerDaoImpl implements AuthendicationManagerDao {
     
	@Autowired
	private JdbcTemplate jt;
	
	
	

	
	public AuthenticationManagerDaoImpl() {
		super();
		System.out.println("AuthenticationManagerDaoImpl-0 param constructor");
	}





	@Override
	public int authenticate(UserInfo info) {
	   final String authentication="SELECT count(*) as count from userinfo where username=? and password=?";
		
	   
	   return jt.queryForObject(authentication, Integer.class,info.getUserName(),info.getPassword());
	}

}
