package com.laptrinhjavaweb.service;
import java.util.List;
import com.laptrinhjavaweb.model.newModel;
import com.laptrinhjavaweb.paging.Pageble;
import com.opensymphony.module.sitemesh.Page;

public interface INewService {
	List<newModel> findByCategoryId(Long categoryID);
	newModel save(newModel news);
	newModel update(newModel updateNew);
	void delete(long[] Ids);
	List<newModel> findAll(Pageble pageble);
	int getTotalItem();
	newModel findOne(long id)
}
