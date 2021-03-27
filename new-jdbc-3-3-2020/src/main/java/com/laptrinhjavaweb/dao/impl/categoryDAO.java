package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.mapper.categoryMapper;
import com.laptrinhjavaweb.mapper.newMapper;
import com.laptrinhjavaweb.model.categoryModel;
import com.laptrinhjavaweb.model.newModel;

public class categoryDAO extends abstractDAO<categoryModel> implements ICategoryDAO {
	@Override
	public List<categoryModel> findAll(){
		String sql =  "SELECT * FROM category";
		return query(sql, new categoryMapper());
	}

	@Override
	public categoryModel findOne(long id) {
		String sql = "SELECT * FROM category WHERE id = ?";
		List<categoryModel> category = query(sql, new categoryMapper(), id);
		return category.isEmpty() ? null : category.get(0); 
	}

	@Override
	public categoryModel findOneByCode(String code) { 
		String sql = "SELECT * FROM category WHERE code = ?";
		List<categoryModel> category = query(sql, new categoryMapper(), code);
		return category.isEmpty() ? null : category.get(0); 
	}

}
