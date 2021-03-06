package com.laptrinhjavaweb.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.constain.systemConstain;
import com.laptrinhjavaweb.model.newModel;
import com.laptrinhjavaweb.paging.PageRequest;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.service.INewService;
import com.laptrinhjavaweb.service.iCategoryService;
import com.laptrinhjavaweb.service.impl.categoryService;
import com.laptrinhjavaweb.sort.Sorter;
import com.laptrinhjavaweb.ultils.FormUlti;

@WebServlet(urlPatterns = {"/admin-new"})
public class NewController extends HttpServlet {
	@Inject
	private iCategoryService categoryService;
	@Inject
	INewService newservice;
	private static final long serialVersionUID = 2686801510274002166L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		newModel model = FormUlti.toModel(newModel.class, req);
		String views = "";
		if (model.getType().equals(systemConstain.LIST)) {
			Pageble pageble = new PageRequest(model.getPage(), model.getMaxPageItem(), new Sorter(model.getSortName(), model.getSortBy()));
			model.setListResult(newservice.findAll(pageble));
			model.setTotalItem(newservice.getTotalItem());
			model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getMaxPageItem()));
			views = "/views/admin/new/list.jsp";

		} else if (model.getType().equals(systemConstain.EDIT)) {
			if (model.getId() != null) {
				model = newservice.findOne(model.getId());
			} else {
				
			}
			req.setAttribute("categories", categoryService.findAll());
			views = "/views/admin/new/edit.jsp";
			req.setAttribute(systemConstain.MODEL, model);
		}
		req.setAttribute(systemConstain.MODEL, model);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher(views);
		requestDispatcher.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}