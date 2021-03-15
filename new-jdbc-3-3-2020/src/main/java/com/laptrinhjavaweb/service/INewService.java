package com.laptrinhjavaweb.service;
import java.util.List;
import com.laptrinhjavaweb.model.newModel;

public interface INewService {
	List<newModel> findByCategoryId(Long categoryID);
	newModel save(newModel news);
}
