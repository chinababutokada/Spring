package com.nt.service;

public interface IAuthenticateManagerService {
	public void signIn(String userName,String password);
	public void signOut();
	public boolean isValid();

}
