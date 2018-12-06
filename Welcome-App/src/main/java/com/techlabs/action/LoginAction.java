package com.techlabs.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;
	private String post = "false";
	private String message;

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if (post.equals("true")) {
			if (userName.equals(password) && !userName.isEmpty() && !password.isEmpty()) {
				message = "Welcome";
			} else if (userName.isEmpty()) {
				addFieldError("user", "Invalid Username");
			} else if (password.isEmpty()) {
				addFieldError("user", "Invalid Password");
			} else if (userName.isEmpty() && password.isEmpty()) {
				addFieldError("user", "Invalid Username and Password");
			}else {
				message = "Unauthorised Person";
			}
		}

	}

	@Override
	public String execute() throws Exception {

		return Action.SUCCESS;
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

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
