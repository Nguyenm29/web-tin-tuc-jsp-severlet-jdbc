package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;

import com.laptrinhjavaweb.model.categoryModel;

public class categoryMapper implements rowMapper<categoryModel> {

	@Override
	public categoryModel mapRow(ResultSet resultSet) {
		try {
			categoryModel category = new categoryModel();
			category.setId(resultSet.getLong("id"));
			category.setName(resultSet.getString("code"));
			category.setCode(resultSet.getString("name"));	
			return category;
		} catch (Exception e) {
			return null;
		}
	}

}
