package com.laptrinhjavaeb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.impl.newDAO;
import com.laptrinhjavaweb.model.newModel;
import com.laptrinhjavaweb.service.INewService;

public class newService implements INewService {
	@Inject 
	private newDAO newDAO;
	
	@Override
	public List<newModel> findByCategoryId(Long categoryID) {
		// TODO Auto-generated method stub
		return newDAO.findByIdCategory(categoryID);
	}

	@Override
	public newModel save(newModel news) {
		Long newID = newDAO.save(news);
		System.out.println("id moi la" + newID);
		return null;
	}
	
//	@Override
//	public newModel save(newModel news) {
//		Long newId = newDAO.save(news);
//		System.out.println("new id la" + newId);
//		return null;
//	}
}
