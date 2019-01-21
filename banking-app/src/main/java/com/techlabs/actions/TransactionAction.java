package com.techlabs.actions;

import java.util.Map;
import java.util.UUID;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Account;
import com.techlabs.model.Transaction;
import com.techlabs.service.BankService;

public class TransactionAction implements Action, SessionAware {
	@Autowired
	BankService bankService;

	private String postTrans = "false";
	private int amount;
	private String transactionType;
	private SessionMap<String, Object> map;
	private int totalAmount;
	private Account account;
	private String name;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		account = (Account) map.get("account");

		name = account.getName();
		if (postTrans.equals("true") && account != null) {

			totalAmount = account.getAmount();
			if (transactionType.equals("1")) {
				transactionType = "D";
				totalAmount = totalAmount + amount;
			} else {
				transactionType = "W";
				totalAmount = totalAmount - amount;
			}
			UUID uuid = UUID.randomUUID();
			account.setAmount(totalAmount);
			Transaction transaction = new Transaction(uuid.toString(), account.getName(), transactionType, amount,
					account);
			bankService.setAmount(account);
			bankService.doTransaction(transaction);
			postTrans = "false";
			return Action.INPUT;
		}

		return Action.SUCCESS;
	}

	public String getPostTrans() {
		return postTrans;
	}

	public void setPostTrans(String postTrans) {
		this.postTrans = postTrans;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		map = (SessionMap<String, Object>) session;
	}

}
