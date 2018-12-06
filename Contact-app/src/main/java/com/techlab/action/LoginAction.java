package com.techlab.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;

public class LoginAction implements SessionAware, Action {
	private String userName;
	private String password;
	private boolean post;
	SessionMap<String, Object> sessionMap;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(sessionMap.get("user"));
		if (post) {
			if (userName.equals(password)) {
				sessionMap.put("user", userName);
				return Action.LOGIN;
			} else {
				return Action.ERROR;
			}
		} else {
			return Action.SUCCESS;
		}
		

	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap = (SessionMap<String, Object>) session;

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isPost() {
		return post;
	}

	public void setPost(boolean post) {
		this.post = post;
	}

}
