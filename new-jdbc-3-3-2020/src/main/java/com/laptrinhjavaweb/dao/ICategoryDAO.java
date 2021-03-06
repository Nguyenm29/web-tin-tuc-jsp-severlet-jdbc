package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.categoryModel;

public interface ICategoryDAO extends genericDAO<categoryModel> {
	List<categoryModel> findAll();
	categoryModel findOne(long id);
	public categoryModel findOneByCode(String code);
}
