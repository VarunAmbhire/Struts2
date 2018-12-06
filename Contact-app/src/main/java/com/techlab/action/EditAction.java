package com.techlab.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.techlab.model.Contact;
import com.techlab.service.ContactService;

public class EditAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String editName;
	private int editNumber;
	private String editAddress;
	private String editPost = "false";
	private static int index = 0;
	SessionMap<String, Object> map;

	@Override
	public void validate() {
		if (editPost.equals("true")) {
			if (editName.isEmpty()) {
				addFieldError("labelName", "Name is required");
			}
			if (editNumber == 0) {
				addFieldError("labelNumber", "Number is required");
			}
			if (editAddress.isEmpty()) {
				addFieldError("labelAddress", "Address is required");

			}
		}
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		List<Contact> list = ContactService.getInstance().getContacts();

		if (editPost.equals("false")) {
			index = Integer.parseInt(ServletActionContext.getRequest().getParameter("index"));

			Contact contact = ContactService.getInstance().getCont(index);
			editName = contact.getName();
			editNumber = contact.getNumber();
			editAddress = contact.getAddress();
			return Action.SUCCESS;
		} else {
			Contact contact = new Contact(editName, editNumber, editAddress);
			ContactService.getInstance().update(index, contact);
			return Action.LOGIN;
		}
	}

	

	public String getEditName() {
		return editName;
	}

	public void setEditName(String editName) {
		this.editName = editName;
	}

	public int getEditNumber() {
		return editNumber;
	}

	public void setEditNumber(int editNumber) {
		this.editNumber = editNumber;
	}

	public String getEditAddress() {
		return editAddress;
	}

	public void setEditAddress(String editAddress) {
		this.editAddress = editAddress;
	}

	public String getEditPost() {
		return editPost;
	}

	public void setEditPost(String editPost) {
		this.editPost = editPost;
	}

}