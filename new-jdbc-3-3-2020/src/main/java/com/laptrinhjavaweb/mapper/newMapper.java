package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;

import com.laptrinhjavaweb.model.newModel;

public class newMapper implements rowMapper<newModel> {

	@Override
	public newModel mapRow(ResultSet resultSet) {
		try {
		newModel newmodel = new newModel();
		newmodel.setTitle(resultSet.getString("title"));
		newmodel.setId(resultSet.getLong("id"));
		return newmodel;
		} catch (Exception e) {
			return null;
		}
	}

}
