package com.laptrinhjavaweb.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.model.newModel;
import com.laptrinhjavaweb.service.INewService;
import com.laptrinhjavaweb.service.iCategoryService;
@WebServlet(urlPatterns =  {"/trang-chu"})
public class HomeController extends HttpServlet {						
//	@Inject
//	private iCategoryService categoryService;
	@Inject
//	private INewService newService;
	private static final long serialVersionUID = 2686801510274002166L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////		// TODO Auto-generated method stub
////		String title = "bai viet 4";
////		String content = "bai viet 4";
////		Long categoryId = 1L;
////		newModel new_model = new newModel();
////		new_model.setTitle(title);
////		new_model.setContent(content);
////		new_model.setCategoryId(categoryId);
////		newService.save(new_model);
//		Long id = 1L;
//		req.setAttribute("new", newService.findByCategoryId(id));	
//		req.setAttribute("category", categoryService.findAll());
		RequestDispatcher rd = req.getRequestDispatcher("/views/web/home.jsp");
		rd.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
