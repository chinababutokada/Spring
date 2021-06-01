package com.nt.dao;

import com.nt.dto.UserInfo;

public interface AuthendicationManagerDao {
	

	public int authenticate(UserInfo info);

}
