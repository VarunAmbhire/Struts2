package com.techlabs.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Account {

	@Id
	private String id;
	private String name;
	private int amount;
	private String password;
	private int block;
	@OneToMany
	private List<Transaction> transactions;

	public Account() {
		super();
	}

	public Account(String id, String name, int amount, int block, List<Transaction> transactions) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.block = block;
		this.transactions = transactions;
	}

	public Account(String id, String name, int amount, String password) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.password = password;
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

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBlock() {
		return block;
	}

	public void setBlock(int block) {
		this.block = block;
	}

}
