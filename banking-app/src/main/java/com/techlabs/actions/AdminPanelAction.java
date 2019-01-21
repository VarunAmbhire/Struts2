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

public class AdminPanelAction implements Action, SessionAware {
	@Autowired
	BankService bankService;
	private SessionMap<String, Object> map;
	private List<Transaction> transactions;
	private List<Account> accounts;
	private String post = "false";
	private String blockId;
	private int block;

	public AdminPanelAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		map = (SessionMap<String, Object>) session;
	}

	@Override
	public String execute() throws Exception {
		transactions = bankService.getAllTransactions();
		accounts = bankService.getAllAccount();

//		if (post.equals("true")) {
		System.out.println(block + " +++++++++++++++++++++++++++ " + blockId);
//			int state;

		if (blockId != null) {
			if (block == 0) {
				block = 1;
			} else {
				block = 0;
			}
			bankService.setUnblock(blockId, block);
		}
		post = "false";
//			blockId = "";
//		}
		return Action.SUCCESS;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public String getBlockId() {
		return blockId;
	}

	public void setBlockId(String blockId) {
		this.blockId = blockId;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public int getBlock() {
		return block;
	}

	public void setBlock(int block) {
		this.block = block;
	}

}
