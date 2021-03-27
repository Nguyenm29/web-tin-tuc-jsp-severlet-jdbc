package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import com.laptrinhjavaweb.dao.IUserDAO;
import com.laptrinhjavaweb.mapper.UserMapper;
import com.laptrinhjavaweb.model.userModel;

public class UserDAO extends abstractDAO<userModel> implements IUserDAO {

	@Override
	public userModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
		StringBuilder sql = new StringBuilder("select * from user as u");
		sql.append(" inner join role as r on r.id = u.roleid"); 
		sql.append(" where username = ? and password = ? and status = ?");
		List<userModel> users = query(sql.toString(), new UserMapper(), userName, password, status);
		return users.isEmpty() ? null : users.get(0);
	}
	

}
