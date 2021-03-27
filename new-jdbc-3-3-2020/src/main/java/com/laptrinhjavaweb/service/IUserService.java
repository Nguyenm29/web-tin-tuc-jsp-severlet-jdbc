package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.model.userModel;

public interface IUserService {
	public userModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
}
