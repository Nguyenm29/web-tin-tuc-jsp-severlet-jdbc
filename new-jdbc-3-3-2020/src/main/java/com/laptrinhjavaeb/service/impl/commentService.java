package com.laptrinhjavaeb.service.impl;

import java.util.List;

import com.laptrinhjavaweb.dao.impl.commentDAO;
import com.laptrinhjavaweb.model.commentModel;
import com.laptrinhjavaweb.service.ICommentService;

public class commentService implements ICommentService {
	private commentDAO comment_dao;
	@Override
	public List<commentModel> findAll() {
		// TODO Auto-generated method stub
		return comment_dao.findAll();
	}

}
