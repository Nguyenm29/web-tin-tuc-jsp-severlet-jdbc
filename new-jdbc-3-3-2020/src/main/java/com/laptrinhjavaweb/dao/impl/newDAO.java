package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import com.laptrinhjavaweb.dao.INewDAO;
import com.laptrinhjavaweb.mapper.newMapper;
import com.laptrinhjavaweb.model.newModel;
import com.laptrinhjavaweb.paging.Pageble;

public class newDAO extends abstractDAO<newModel> implements INewDAO {
	@Override
	public List<newModel> findByIdCategory(Long categoryId) {
		String sql = "SELECT * FROM news WHERE categoryid = ?";
		return query(sql, new newMapper(), categoryId);
	}

	@Override
	public Long save(newModel news) {
		
		StringBuilder sql = new StringBuilder("insert into news (title, content, ");
		sql.append("thumbnail, shortdescription, categoryid, createddate, createdby)");
		sql.append("values(?, ? , ?, ?, ?, ?, ?)");
		return insert(sql.toString(), news.getTitle(), news.getContent(), news.getThumbnail(), news.getShortDescription(), news.getCategoryId(), news.getCreatedDate(), news.getCreatedBy());
	}

	@Override
	public newModel findOne(Long id) {
		String sql = "SELECT * FROM news WHERE id = ?";
		List<newModel> news = query(sql, new newMapper(), id);
		return news.isEmpty() ? null : news.get(0);
	}

	@Override
	public void update(newModel updateNew) {
		// TODO Auto-generated method stub
		StringBuffer sql = new StringBuffer("UPDATE news SET title = ?, thumbnail = ?, ");
		sql.append("shortdescription = ?, content = ?, categoryid = ?, ");
		sql.append("createddate = ?, createdby = ?, modifieddate = ?, modifiedby = ? WHERE id = ?");

		update(sql.toString(), updateNew.getTitle(), updateNew.getThumbnail(), updateNew.getShortDescription(),
				updateNew.getContent(), updateNew.getCategoryId(), updateNew.getCreatedDate(), updateNew.getCreatedBy(),
				updateNew.getModifiedDate(), updateNew.getModifiedBy(), updateNew.getId());

	}

	@Override
	public void delete(long id) {
		String sql = "DELETE FROM news WHERE id = ?";
		update(sql, id);
	}

	@Override
	public List<newModel> findAll(Pageble pageble) {
		StringBuilder sql = new StringBuilder("SELECT * FROM news");
		if (pageble.getSorter() !=  null) {
			sql.append(" ORDER BY "+pageble.getSorter().getSortName()+" "+pageble.getSorter().getSortBy()+"");
		}
		if (pageble.getOffset() != null && pageble.getLimit() != null) {
			sql.append(" LIMIT "+pageble.getOffset()+", "+pageble.getLimit()+"");
		}
		return query(sql.toString(),new newMapper());
	}

	@Override
	public int getTotalItem() {
		String sql = "select count(*) from news";
		return count(sql);
	}

}
