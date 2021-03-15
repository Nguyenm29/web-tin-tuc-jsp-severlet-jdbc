package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.mapper.categoryMapper;
import com.laptrinhjavaweb.model.categoryModel;

public class categoryDAO extends abstractDAO<categoryModel> implements ICategoryDAO {
//	public Connection getConnection() {
//		try {
//            Class.forName("com.mysql.jdbc.Driver");
//            String url = "jdbc:mysql://localhost:3306/newseverlet";
//            String user = "root";
//            String password = "19691969";
//            return DriverManager.getConnection(url, user, password);
//		} catch (ClassNotFoundException | SQLException e) {
//			return null;
//		}
//	}
	@Override
	public List<categoryModel> findAll(){
		 String sql =  "SELECT * FROM category";
//		// TODO Auto-generated method stub
//		 List<categoryModel> result = new ArrayList<>();

//		 Connection connection = getConnection();
//		 PreparedStatement statement = null;
//		 ResultSet resultSet = null;
//		 if (connection != null) {
//			try {
//				statement = connection.prepareStatement(sql);
//				resultSet = statement.executeQuery();
//				while (resultSet.next()) {
//					categoryModel category = new categoryModel();
//					category.setId(resultSet.getLong("id"));
//					category.setName(resultSet.getString("code"));
//					category.setCode(resultSet.getString("name"));					
//					result.add(category);
//				}
//				return result;
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				return null;
//			} finally {
//				try {
//				if (connection != null) {
//					connection.close();
//				}
//				if (statement != null) {
//					statement.close();
//				}
//				if (resultSet != null) {
//					resultSet.close();
//				}
//				} catch (Exception e) {
//					return null;
//				}
//			}
//		}
//		 return null;
		return query(sql, new categoryMapper());
	}

}
