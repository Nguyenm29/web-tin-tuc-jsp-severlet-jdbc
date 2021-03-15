package com.laptrinhjavaweb.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.dao.ICommentDAO;
import com.laptrinhjavaweb.model.commentModel;

public class commentDAO implements ICommentDAO {
	public Connection getConnetion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/newseverlet";
			String user = "root";
			String pass = "19691969";
			try {
				return DriverManager.getConnection(url,user, pass);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				return null;
			}
		} catch (ClassNotFoundException e) {
			return null;
		}
		
	}
	@Override
	public List<commentModel> findAll() {
		// TODO Auto-generated method stub
		List<commentModel> result = new ArrayList<commentModel>();
		String sql = "select*from comment";
		Connection connection = getConnetion();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		if (connection !=  null) {
			try {
			statement = connection.prepareStatement(sql);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				commentModel comment_moodel = new commentModel();
				comment_moodel.setId(resultSet.getLong("id"));
			}
			return result;
			} finally {
				try {
					if (connection != null) {
						connection.close();
					}
					if (statement != null) {
						statement.close();
					}
					if (resultSet != null) {
						resultSet.close();
					} catch (Exception e) {
						return null;
					}
				}
			}
		}
		return null;
	}

}
