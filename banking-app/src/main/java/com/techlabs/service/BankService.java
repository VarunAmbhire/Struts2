package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Account;
import com.techlabs.model.Admin;
import com.techlabs.model.Transaction;
import com.techlabs.repository.BankRepo;

@Service
public class BankService {

	@Autowired
	BankRepo bankRepo;

	public void doTransaction(Transaction transaction) {
		bankRepo.doTrasaction(transaction);
	}

	public List<Transaction> getAllTransactions() {
		return bankRepo.getAllTransaction();
	}

	public List<Transaction> getTransactions(Account account) {
		return bankRepo.getTransaction(account);
	}

	public void addAccount(Account account) {
		bankRepo.addAccount(account);
	}

	public Account getAccount(String id) {
		return bankRepo.getAccount(id);
	}

	public List<Account> getAllAccount() {
		return bankRepo.getAllAccount();
	}

	public Admin getAdmin() {
		return bankRepo.getAdmin();
	}

	public void setAccount(Account account) {
		bankRepo.setAccount(account);
	}

	public void setUnblock(String id, int state) {
		bankRepo.setUnblock(id, state);
	}

	public void setAmount(Account account) {
		bankRepo.setAmount(account);
	}
}
