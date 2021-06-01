package com.nt.service;

import com.nt.dao.AuthendicationManagerDao;
import com.nt.dto.UserInfo;

public class AuthenticateManagerserviceImpl implements IAuthenticateManagerService {
 
   ThreadLocal<UserInfo> tl = new ThreadLocal<>();
		
   private AuthendicationManagerDao authdao = null;
   
   
	
	public AuthenticateManagerserviceImpl(AuthendicationManagerDao authdao) {
	super();
	this.authdao = authdao;
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
		
		return authdao.authenticate(tl.get())==1?true:false;
	}

}
