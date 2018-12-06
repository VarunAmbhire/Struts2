package com.techlabs.action;

import java.util.Date;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction implements Action {
	private String message;
	private String date;
	private String post = "false";
	private String user;
	private String methodType;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Date dt = new Date();
		message = "Home Action";
		date = dt.toString();
		
		
		
		if (post.equals("false")) {
			methodType = "Get";
		} else {
			methodType = "Post";
		}
		user = this.getUser();
		return Action.SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getMethodType() {
		return methodType;
	}

	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}

}
