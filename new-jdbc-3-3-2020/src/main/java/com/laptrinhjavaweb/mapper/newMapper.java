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
		newmodel.setContent(resultSet.getString("content"));
		newmodel.setCategoryId(resultSet.getLong("categoryid"));
		newmodel.setThumbnail(resultSet.getString("thumbnail"));
		newmodel.setShortDescription(resultSet.getString("shortdescription"));
		newmodel.setCreatedDate(resultSet.getTimestamp("createddate"));
		newmodel.setCreatedBy(resultSet.getString("createdby"));
		if (resultSet.getTimestamp("modifieddate") != null) {
			newmodel.setModifiedDate(resultSet.getTimestamp("modifieddate"));
		}
		if (resultSet.getString("modifiedby") != null) {
			newmodel.setModifiedBy(resultSet.getString("modifiedby"));
		}
		return newmodel;
		} catch (Exception e) {
			return null;
		}
	}

}
