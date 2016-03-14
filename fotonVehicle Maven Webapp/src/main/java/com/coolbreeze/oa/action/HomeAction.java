package com.coolbreeze.oa.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;


@Controller
@Scope("prototype")
public class HomeAction extends ActionSupport{

	
	public String index(){
		return "index";
	}
	
	public String left(){
		return "left";
	}
	
	public String right(){
		return "right";
	}
}
