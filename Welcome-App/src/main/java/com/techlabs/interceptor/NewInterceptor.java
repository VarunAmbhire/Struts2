package com.techlabs.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class NewInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
System.out.println("New Interceptor Destroyed");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
System.out.println("New Interceptor Craeted");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("New InterceptorW");
		return invocation.invoke();
	}

}
