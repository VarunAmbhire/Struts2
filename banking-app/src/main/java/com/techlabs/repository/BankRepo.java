package com.techlabs.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.model.Account;
import com.techlabs.model.Admin;
import com.techlabs.model.Transaction;

@Repository
public class BankRepo {
	@Autowired
	SessionFactory sessionFactory;
	Session session;

	public void doTrasaction(Transaction transaction) {
		session = sessionFactory.openSession();
//		session.beginTransaction();
		session.save(transaction);
		session.beginTransaction().commit();
		session.close();
	}

	public List<Account> getAllAccount() {
		session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Account.class);
		List<Account> accounts = criteria.list();
		session.close();
		return accounts;
	}

	public List<Transaction> getAllTransaction() {
		session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Transaction.class);
		List<Transaction> transactions = criteria.list();
		session.close();
		return transactions;
	}

	public List<Transaction> getTransaction(Account account) {
		session = sessionFactory.openSession();
		System.out.println("Account -->" + account);
		Criteria criteria = session.createCriteria(Transaction.class);
		criteria.add(Restrictions.eq("account", account));
		List<Transaction> transactions = criteria.list();
		session.close();
		return transactions;
	}

	public void addAccount(Account account) {
		session = sessionFactory.openSession();
		session.save(account);
		session.beginTransaction().commit();
		session.close();
	}

	public Account getAccount(String id) {
		session = sessionFactory.openSession();
		Account account = (Account) session.get(Account.class, id);
		session.close();
		return account;
	}

	public Admin getAdmin() {
		session = sessionFactory.openSession();
		Admin admin = (Admin) session.get(Admin.class, "100");
		session.close();
		return admin;
	}

	public void setAccount(Account account) {
		session = sessionFactory.openSession();
		Account acc = (Account) session.get(Account.class, account.getId());
		acc.setBlock(account.getBlock());
		session.beginTransaction().commit();
		session.close();
	}

	public void setUnblock(String id, int state) {
		session = sessionFactory.openSession();
		Account acc = (Account) session.get(Account.class, id);
		acc.setBlock(state);
		session.beginTransaction().commit();
		session.close();
	}

	public void setAmount(Account account) {
		session = sessionFactory.openSession();
		Account acc = (Account) session.get(Account.class, account.getId());
		
		acc.setAmount(account.getAmount());
		session.beginTransaction().commit();
		session.close();
	}

}
