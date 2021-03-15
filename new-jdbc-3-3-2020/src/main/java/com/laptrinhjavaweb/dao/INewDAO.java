package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.newModel;

public interface INewDAO extends genericDAO<newModel> {
	List<newModel> findByIdCategory(Long categoryId);
	Long save(newModel news);
}