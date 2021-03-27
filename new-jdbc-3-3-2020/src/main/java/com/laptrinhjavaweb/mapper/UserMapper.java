package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.model.roleModel;
import com.laptrinhjavaweb.model.userModel;

public class UserMapper implements rowMapper<userModel> {

	@Override
	public userModel mapRow(ResultSet resultSet) {
		try {
			userModel user = new userModel();
			user.setId(resultSet.getLong("id"));
			user.setUserName(resultSet.getString("username"));
			user.setFullName(resultSet.getString("fullname"));
			user.setPassword(resultSet.getString("password"));
			user.setStatus(resultSet.getInt("status"));
			try {
				roleModel role = new roleModel();
				role.setCode(resultSet.getString("code"));
				role.setName(resultSet.getString("name"));
				user.setRole(role);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			return user;
		} catch (SQLException e) {
			return null;
		}	
	}
}
