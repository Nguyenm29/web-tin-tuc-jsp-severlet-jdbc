package com.laptrinhjavaweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.dao.impl.categoryDAO;
import com.laptrinhjavaweb.model.categoryModel;
import com.laptrinhjavaweb.service.iCategoryService;

public class categoryService implements iCategoryService {
//	
//	public categoryService() {
//		// TODO Auto-generated constructor stub
//		categoryDao = new categoryDAO();
//	}
	@Inject 
	private ICategoryDAO categoryDao;
	public categoryService() {
		
	}
	@Override
	public List<categoryModel> findAll() {
		// TODO Auto-generated method stub
		return categoryDao.findAll();
	}

}
