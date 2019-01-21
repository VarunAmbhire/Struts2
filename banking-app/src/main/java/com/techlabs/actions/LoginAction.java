package com.techlabs.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Account;
import com.techlabs.service.BankService;

public class LoginAction implements Action, SessionAware {
	@Autowired
	BankService bankService;
	private String post = "false";
		   
	private String id;
	private String password;
	private Map<String, Object> map;
	private static int count = 0;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub

		if (post.equals("true")) {
			Account account = bankService.getAccount(id);

			if (account.getBlock() == 0) {
				if (count >= 3) {
					account.setBlock(1);
					bankService.setAccount(account);
					return Action.ERROR;
				}

				System.out.println(post + "------------------ " + id + "-------- " + password + " " + count);
				System.out.println(account.getId());
				if (account.getId().equals(id) && account.getPassword().equals(password)) {
					map.put("account", account);
					count = 0;
					return Action.SUCCESS;
				} else {
					count++;
				}
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
