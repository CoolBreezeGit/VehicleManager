package com.coolbreeze.oa.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;




@Controller
@Scope("prototype")
public class UserAction extends ActionSupport{

	
	public String loginUI(){

		return "loginUI";
		
	}
	
	public String login(){

		return "toIndex";
		
	}
	
	public String index(){
		return "index";
	}
	
	
	
}
