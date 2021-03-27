package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.newModel;
import com.laptrinhjavaweb.paging.Pageble;

public interface INewDAO extends genericDAO<newModel> {
	newModel findOne(Long id);
	List<newModel> findByIdCategory(Long categoryId);
	Long save(newModel news);
	void update(newModel updateNew);
	void delete(long id);
	List<newModel> findAll(Pageble pageble);
	int getTotalItem();
}
