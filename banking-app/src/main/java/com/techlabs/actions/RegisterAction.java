package com.techlabs.actions;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Account;
import com.techlabs.service.BankService;

public class RegisterAction implements Action{
	@Autowired
	BankService bankService;
	
	private String postRegister="false";
	private String id;
	private String name;
	private int amount;
	private String password;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		UUID uuid=UUID.randomUUID();		
		id=uuid.toString();

		if(postRegister.equals("true")) {
			Account account=new Account(id, name, amount, password);
			bankService.addAccount(account);
			return Action.LOGIN;
		}		
		
		return Action.SUCCESS;
	}

	public String getPostRegister() {
		return postRegister;
	}

	public void setPostRegister(String postRegister) {
		this.postRegister = postRegister;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
