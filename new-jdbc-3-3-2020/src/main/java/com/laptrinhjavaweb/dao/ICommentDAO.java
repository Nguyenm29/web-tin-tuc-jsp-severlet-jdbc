package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.commentModel;

public interface ICommentDAO {
	List<commentModel> findAll();
}
