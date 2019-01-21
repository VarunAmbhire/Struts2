package com.techlabs.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opencsv.CSVWriter;
import com.opensymphony.xwork2.Action;
import com.techlabs.model.Account;
import com.techlabs.model.Transaction;
import com.techlabs.service.BankService;

public class DownloadAction implements Action, SessionAware {

	@Autowired
	BankService bankService;

	private Map<String, Object> map;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub

		List<Transaction> transactionList = new ArrayList<>();
		HttpServletRequest request = (HttpServletRequest) ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		HttpSession session = request.getSession();

		Account account = (Account) map.get("account");
		transactionList = bankService.getTransactions(account);

		File file = new File("passbook.csv");
		try {
			FileWriter outputfile = new FileWriter(file);
			CSVWriter writer = new CSVWriter(outputfile);

			for (Transaction transaction : transactionList) {
				String data[] = { transaction.getTxnId(), transaction.getName(), transaction.getType(),
						transaction.getAccount().getId() + "" };
				writer.writeNext(data);

			}
			writer.close();
			response.setContentType("text/html");

			PrintWriter out = response.getWriter();
			String filename = "passbook.csv";
			response.setContentType("APPLICATION/OCTET-STREAM");
			response.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");

			FileInputStream fileInputStream = new FileInputStream(filename);

			int i;
			while ((i = fileInputStream.read()) != -1) {
				out.write(i);
			}
			fileInputStream.close();
			out.close();
		} catch (Exception e) {

		}

		return Action.SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		map = session;
	}

}
