package com.coolbreeze.vehicle.interceptor;

import com.coolbreeze.oa.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class PrivilegeInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {

		User user=(User) ActionContext.getContext().getSession().get("user");
		
		String actionName=invocation.getProxy().getActionName();
		//System.out.println(actionName);
		
		if(user==null){
			
			if(actionName.startsWith("userAction_login")){
				return invocation.invoke();
			}else{				
				return "login";
			}
		}else{
			return invocation.invoke();
		}
	}

}
