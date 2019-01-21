package com.techlabs.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Admin;
import com.techlabs.service.BankService;

public class AdminLoginAction implements Action, SessionAware {
	@Autowired
	BankService bankService;
	private String post = "false";
	private String id;
	private String password;
	private Map<String, Object> map;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if (post.equals("true")) {
			Admin admin = bankService.getAdmin();
			if (admin.getId().equals(id) && admin.getPassword().equals(password)) {
				map.put("account", admin);
				return Action.SUCCESS;
			}
		}
		return Action.LOGIN;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		map = session;
	}
}
