package com.coolbreeze.vehicle.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.coolbreeze.vehicle.domain.User;
import com.coolbreeze.vehicle.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


@Controller
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<User>{

	@Resource
	private UserService userService;
	
	private User userDTO=new User();


	public User getModel() {		
		return userDTO;
	}
	
	
	public String loginUI(){

		return "loginUI";
		
	}
	
	public String login(){

		User user=userService.findByNameAndPasswd(userDTO.getName(),userDTO.getPassword());
		if(user==null){
			
			addFieldError("error", "用户名或密码错误！");
			
			return "loginUI";
		}else{
			
			ActionContext.getContext().getSession().put("user", user);
			
			return "toIndex";
		}
		
	}
	
	public String logout(){
		ActionContext.getContext().getSession().remove("user");
		return "loginUI";
	}

	
	
	
	
}
