package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.model.commentModel;

public interface ICommentService {
	List<commentModel> findAll();
}
