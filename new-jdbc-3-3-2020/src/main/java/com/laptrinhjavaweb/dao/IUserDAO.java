package com.laptrinhjavaweb.dao;

import com.laptrinhjavaweb.model.userModel;

public interface IUserDAO extends genericDAO<userModel> {
	userModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
}
