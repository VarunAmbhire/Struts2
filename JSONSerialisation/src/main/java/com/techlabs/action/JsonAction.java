package com.techlabs.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Employee;

public class JsonAction implements Action {
	
	private ArrayList<Employee> employees = new ArrayList<>();
//	private String name;
	
	public JsonAction() {
		// TODO Auto-generated constructor stub
		Employee employee = new Employee(101, "Varun", "Male");
		Employee employee1 = new Employee(102, "Marine", "Male");
		Employee employee2 = new Employee(103, "Victoria", "Female");

		employees.add(employee);
		employees.add(employee1);
		employees.add(employee2);
		
	}

	@Override
	public String execute() throws Exception {
		return Action.SUCCESS;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

}
