package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.mapper.rowMapper;
import com.laptrinhjavaweb.model.newModel;

public interface genericDAO<T> {
	<T> List<T> query(String sql, rowMapper<T> rowMapper, Object... parameters);
	void update(String sql, Object... parameters);
	Long insert(String sql, Object... parameters);
	int count(String sql, Object...parameters);	
}
