package com.it.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public String findById(){
		return SUCCESS;
	}

}
