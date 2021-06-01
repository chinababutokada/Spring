package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserInfo implements Serializable{
	
	private String userName;
	private String password;

}
