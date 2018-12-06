package com.techlabs.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.viewmodel.RegisterViewModel;

public class RegisterAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	RegisterViewModel vm;

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if (vm != null) {
			System.out
					.println(vm.getFirstName() + " " + vm.getLastName() + " " + vm.geteMail() + " " + vm.getAddress());
			if (vm.getFirstName().isEmpty()) {
				addFieldError("labelFirstName", "First Name Required");
			}
			if (vm.getLastName().isEmpty()) {
				addFieldError("labelLastName", "Last Name Required");
			}
			if (vm.geteMail().isEmpty()) {
				addFieldError("labelEmail", "Email Required");
			}
			if (vm.getAddress().isEmpty()) {
				addFieldError("labelAddress", "Address Required");
			}
		}

	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return Action.SUCCESS;
	}

	public RegisterViewModel getVm() {
		return vm;
	}

	public void setVm(RegisterViewModel vm) {
		this.vm = vm;
	}

}
