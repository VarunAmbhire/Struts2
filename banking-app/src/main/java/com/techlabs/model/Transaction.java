package com.techlabs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {

	@Id
	private String txnId;
	private String name;
	private String type;
	private int ammount;
	@ManyToOne
	private Account account;

	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	
	public Transaction(String txnId, String name, String type, int ammount, Account account) {
		super();
		this.txnId = txnId;
		this.name = name;
		this.type = type;
		this.ammount = ammount;
		this.account = account;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAmmount() {
		return ammount;
	}

	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
