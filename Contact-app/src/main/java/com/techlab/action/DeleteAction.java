package com.techlab.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.techlab.service.ContactService;

public class DeleteAction implements Action {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		int index = Integer.parseInt(ServletActionContext.getRequest().getParameter("index"));
		ContactService.getInstance().delete(index);

		return Action.SUCCESS;
	}

}
