package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.AuthendicationManagerDao;
import com.nt.dto.UserInfo;

@Service("authService")
public class AuthenticateManagerserviceImpl implements IAuthenticateManagerService {
 
   ThreadLocal<UserInfo> tl = new ThreadLocal<>();
	
   @Autowired
   private AuthendicationManagerDao authDao;
   
   
	
	

	public AuthenticateManagerserviceImpl() {
	super();
	System.out.println("AuthenticateManagerserviceImpl-0 param");
	
	}

	@Override
	public void signIn(String userName, String password) {
	
		UserInfo info = new UserInfo();
		info.setUserName(userName);
		info.setPassword(password);
		tl.set(info);
		

	}

	@Override
	public void signOut() {
		
		tl.remove();

	}

	@Override
	public boolean isValid() {
		
		return authDao.authenticate(tl.get())==1?true:false;
	}

}
