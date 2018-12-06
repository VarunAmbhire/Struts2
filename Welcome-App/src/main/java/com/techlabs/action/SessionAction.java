package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.techlabs.viewmodel.CounterViewModel;

public class SessionAction implements SessionAware, Action {
	CounterViewModel counter=new CounterViewModel();
	private SessionMap<String, Object> sessionMap;
	private int count;

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		sessionMap = (SessionMap<String, Object>) session;
	}

	@Override
	public String execute() throws Exception {
			count = Integer.parseInt(sessionMap.get("hitCount").toString());
			counter.setOldCount(count);

		count++;
		sessionMap.put("hitCount", count);
		count = Integer.parseInt(sessionMap.get("hitCount").toString());
		if (counter != null) {
			counter.setNewCount(count);
		}
		System.out.println(counter.getNewCount()+" "+counter.getOldCount());

		return Action.SUCCESS;
	}

}
