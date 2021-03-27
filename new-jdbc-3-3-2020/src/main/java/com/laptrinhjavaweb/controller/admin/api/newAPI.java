package com.laptrinhjavaweb.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.std.MapProperty;
import com.laptrinhjavaweb.model.newModel;
import com.laptrinhjavaweb.model.userModel;
import com.laptrinhjavaweb.service.INewService;
import com.laptrinhjavaweb.service.impl.newService;
import com.laptrinhjavaweb.ultils.SessionUtil;
import com.laptrinhjavaweb.ultils.httpUtil;
import com.mysql.cj.x.protobuf.MysqlxCrud.Update;


@WebServlet(urlPatterns =  {"/api-admin-new"})
public class newAPI extends HttpServlet {
	private static final long serialVersionUID = -9049627631482806812L;
	@Inject
	private INewService new_Service;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		newModel new_model = httpUtil.of(req.getReader()).toModel(newModel.class);
		userModel model = (userModel) SessionUtil.getInstance().getValue(req, "USERMODEL");
		new_model.setCreatedBy(model.getUserName());
		new_model = new_Service.save(new_model);
		System.out.println(new_model);
		mapper.writeValue(resp.getOutputStream(), new_model);
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		newModel update_new_model = httpUtil.of(req.getReader()).toModel(newModel.class);
		update_new_model.setModifiedBy(((userModel) SessionUtil.getInstance().getValue(req, "USERMODEL")).getUserName());
		update_new_model = new_Service.update(update_new_model);
		mapper.writeValue(resp.getOutputStream(), update_new_model);
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		newModel new_model = httpUtil.of(req.getReader()).toModel(newModel.class);
		
		new_Service.delete(new_model.getIds());
		mapper.writeValue(resp.getOutputStream(), "{}");
	}
	
}
