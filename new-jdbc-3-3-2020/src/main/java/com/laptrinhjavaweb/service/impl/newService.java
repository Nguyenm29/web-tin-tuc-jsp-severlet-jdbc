package com.laptrinhjavaweb.service.impl;

//import java.security.Timestamp;
import java.util.List;
//import java.sql.Timestamp;
import javax.inject.Inject;
import java.sql.Timestamp;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.dao.impl.categoryDAO;
import com.laptrinhjavaweb.dao.impl.newDAO;
import com.laptrinhjavaweb.mapper.categoryMapper;
import com.laptrinhjavaweb.model.categoryModel;
import com.laptrinhjavaweb.model.newModel;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.service.INewService;
import com.laptrinhjavaweb.service.iCategoryService;

public class newService implements INewService {
	@Inject 
	private newDAO newDAO;
	@Inject 
	private ICategoryDAO categoryDAO;
	@Override
	public List<newModel> findByCategoryId(Long categoryID) {
		// TODO Auto-generated method stub
		return newDAO.findByIdCategory(categoryID);
	}

	@Override
	public newModel save(newModel news) {
		news.setCreatedDate(new Timestamp(System.currentTimeMillis()));	
		news.setCreatedBy("");
		categoryModel category = categoryDAO.findOneByCode(news.getCategoryCode());
		news.setCategoryId(category.getId());
		Long newId = newDAO.save(news);
		return newDAO.findOne(newId); 
	}

	@Override
	public newModel update(newModel updateNew) {
		newModel oldNew = newDAO.findOne(updateNew.getId());
		updateNew.setCreatedBy(oldNew.getCreatedBy());
		updateNew.setCreatedDate(oldNew.getCreatedDate());
		updateNew.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		updateNew.setModifiedBy("");
		categoryModel category = categoryDAO.findOneByCode(updateNew.getCategoryCode());
		updateNew.setCategoryId(category.getId());
		newDAO.update(updateNew);
		return newDAO.findOne(updateNew.getId()); 
	}

	@Override
	public void delete(long[] Ids) {
		for (long l : Ids) {
			newDAO.delete(l);
		}
		
	}

	@Override
	public List<newModel> findAll(Pageble pageble) {
		return newDAO.findAll(pageble);
	}

	@Override
	public int getTotalItem() {
		return newDAO.getTotalItem();
	}

	@Override
	public newModel findOne(long id) {
		newModel new_model = newDAO.findOne(id);
		categoryModel category_model = categoryDAO.findOne(new_model.getCategoryId());
		new_model.setCategoryCode(category_model.getCode());
		return new_model;
	}

	
//	@Override
//	public newModel save(newModel news) {
//		Long newId = newDAO.save(news);
//		System.out.println("new id la" + newId);
//		return null;
//	}
}
