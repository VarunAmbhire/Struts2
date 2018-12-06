package com.techlab.service;

import java.util.ArrayList;
import java.util.List;

import com.techlab.model.Contact;

public class ContactService {
	private static List<Contact> contactList;

	private static ContactService instance;

	private ContactService() {
		// TODO Auto-generated constructor stub
	}

	public static ContactService getInstance() {
		if (instance == null) {
			instance = new ContactService();
			contactList = new ArrayList<>();
			Contact contact1 = new Contact("Varun", 123456, "India");
			Contact contact2 = new Contact("Price", 456789, "UK");
			Contact contact3 = new Contact("Shephard", 789, "USA");
			contactList.add(contact1);
			contactList.add(contact2);
			contactList.add(contact3);
		}
		return instance;
	}

	public List<Contact> getContacts() {
		return contactList;
	}

	public void addContact(Contact contact) {
		contactList.add(contact);
	}

	public Contact getCont(int id) {
		return contactList.get(id);
	}

	public void update(int id, Contact contact) {
		contactList.set(id, contact);
	}

	public void delete(int id) {
		contactList.remove(id);
	}

}
