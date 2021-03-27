package com.laptrinhjavaweb.service.impl;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.IUserDAO;
import com.laptrinhjavaweb.model.userModel;
import com.laptrinhjavaweb.service.IUserService;

public class UserService implements IUserService {
	@Inject
	private IUserDAO userDAO;
	@Override
	public userModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
		return userDAO.findByUserNameAndPasswordAndStatus(userName, password, status);
	}

}
