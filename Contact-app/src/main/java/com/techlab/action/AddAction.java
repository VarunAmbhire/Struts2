package com.techlab.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.techlab.model.Contact;
import com.techlab.service.ContactService;

public class AddAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String addName;
	private int addNumber;
	private String addAddress;
	private String post = "false";

	@Override
	public void validate() {
		if (post.equals("true")) {
			if (addName.isEmpty()) {
				addFieldError("labelName", "Name is required");
			}
			if (addNumber == 0) {
				addFieldError("labelNumber", "Number is required");
			}
			if (addAddress.isEmpty()) {
				addFieldError("labelAddress", "Address is required");
			}
		}
	}

	@Override
	public String execute() throws Exception {
		if (post.equals("false")) {
			return Action.SUCCESS;
		} else {
			Contact contact = new Contact(addName, addNumber, addAddress);
			ContactService.getInstance().addContact(contact);
			return Action.LOGIN;
		}

	}

	public String getAddName() {
		return addName;
	}

	public void setAddName(String addName) {
		this.addName = addName;
	}

	public int getAddNumber() {
		return addNumber;
	}

	public void setAddNumber(int addNumber) {
		this.addNumber = addNumber;
	}

	public String getAddAddress() {
		return addAddress;
	}

	public void setAddAddress(String addAddress) {
		this.addAddress = addAddress;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

}
