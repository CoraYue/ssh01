package com.huying.web.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.huying.domain.User;
import com.huying.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{

	private User model=new User();
	@Override
	public User getModel() {
		return model;
	}
	
	private Integer id;
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String findById() {
		System.out.println(userService);
		model=userService.findById(model.getId());
		return SUCCESS;
	}
	
	
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
