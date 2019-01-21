package com.techlabs.actions;

import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Account;
import com.techlabs.model.Transaction;
import com.techlabs.service.BankService;

public class PassbookAction implements Action, SessionAware {
	@Autowired
	BankService bankService;
	private SessionMap<String, Object> map;
	private List<Transaction> transactions;
	private String name;
	private int totalAmount;

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		map = (SessionMap<String, Object>) session;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Account account = (Account) map.get("account");
		name = account.getName();
		totalAmount=account.getAmount();
		transactions = bankService.getTransactions(account);
		System.out.println(transactions.size());
		return Action.SUCCESS;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

}
