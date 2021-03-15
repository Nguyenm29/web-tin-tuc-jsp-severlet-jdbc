package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import com.laptrinhjavaweb.dao.INewDAO;
import com.laptrinhjavaweb.mapper.newMapper;
import com.laptrinhjavaweb.model.newModel;

public class newDAO extends abstractDAO<newModel> implements INewDAO {
	@Override
	public List<newModel> findByIdCategory(Long categoryId) {
		String sql = "SELECT * FROM news WHERE categoryid = ?";
//		// TODO Auto-generated method stub
//		List<newModel> result = new ArrayList<>();
//		String sql = "SELECT * FROM news WHERE categoryid = ?";
//		Connection connection = getConnection();
//		PreparedStatement statement = null;
//		ResultSet resultSet = null;
//		if (connection != null) {
//			try {
//			statement = connection.prepareStatement(sql);
//			statement.setLong(1, categoryId);
//			resultSet = statement.executeQuery();
//			while (resultSet.next()) {
//			newModel newmodel = new newModel();
//			newmodel.setTitle(resultSet.getString("title"));
//			newmodel.setId(resultSet.getLong("id"));
//			result.add(newmodel);
//			}
//			return result;
//			} catch (SQLException e) {
//				return null;
//			} finally {
//				try {
//				if (connection != null) {
//					connection.close();
//				}
//				if (statement  != null) {
//					statement.close();
//				}
//				if (resultSet != null) {
//					resultSet.close();
//				}
//			} catch (Exception e) {
//				return null;
//			}	
//		}
//	}
//		return null;
		return query(sql, new newMapper(), categoryId);
	}

	@Override
	public Long save(newModel news) {
		String sql = "insert into news (title, content, categoryid) values(?, ? , ?)";
		return insert(sql, news.getTitle(), news.getContent(), news.getCategoryId());
//		ResultSet resultSet = null;
//		Long id = null;
//		Connection connection = null;
//		PreparedStatement statement = null;
//		try {
//			String sql = "insert into news (title, content, categoryid) values(?, ? , ?)";
//			connection = getConnection();
//			connection.setAutoCommit(false);
//			statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//			statement.setString(1, news.getTitle());
//			statement.setString(2, news.getContent());
//			statement.setLong(3, news.getCategoryId());
//			statement.executeUpdate(); 
//			resultSet = statement.getGeneratedKeys();
//			if (resultSet.next()) {
//				id = resultSet.getLong(1);
//			}
//			connection.commit(); // khi commit moi luu xuong data base
//			return id;
//		} catch (SQLException e) {
//			if (connection != null) {
//				try {
//					connection.rollback();
//				} catch (SQLException e2) {
//					e2.printStackTrace();
//				}
//			}
//			return null;
//		} finally {
//			try { 
//				if (connection != null) {
//					connection.close();
//				}
//				if (statement != null) {
//					statement.close();
//				}
//				if (resultSet != null) {
//					resultSet.close();
//				}
//			} catch (SQLException e) {
//				return null;
//			}
//		}
	}	
}
