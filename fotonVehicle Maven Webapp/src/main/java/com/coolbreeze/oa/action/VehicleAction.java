package com.coolbreeze.oa.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.coolbreeze.oa.domain.V_Brand;
import com.coolbreeze.oa.domain.V_Configure;
import com.coolbreeze.oa.domain.V_Param;
import com.coolbreeze.oa.domain.V_Type;
import com.coolbreeze.oa.service.V_BrandService;
import com.coolbreeze.oa.service.V_ConfigureService;
import com.coolbreeze.oa.service.V_ParamService;
import com.coolbreeze.oa.service.V_TypeService;
import com.coolbreeze.oa.service.VehicleService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller
@Scope("prototype")
public class VehicleAction extends ActionSupport {

	@Resource
	private V_BrandService v_BrandService;
	@Resource
	private V_TypeService v_TypeService;
	@Resource
	private V_ConfigureService v_ConfigureService;
	@Resource
	private V_ParamService v_ParamService;

	private V_Brand v_Brand;
	private V_Type v_Type;
	private V_Configure v_Configure;
	private V_Param v_Param;

	private String msg;

	public String query() {

		if(v_Brand != null){
			
			List<V_Type> v_TypeList=v_TypeService.findByBrandId(v_Brand.getId());
			ActionContext.getContext().put("v_TypeList", v_TypeList);
			
		}else if(v_Type != null){
			
			List<V_Type> v_ConfigureList=v_ConfigureService.findByTypeId(v_Type.getId());
			ActionContext.getContext().put("v_ConfigureList", v_ConfigureList);
			
		}else if(v_Configure != null){
			
			V_Param v_Param=null;
			ActionContext.getContext().put("v_Param", v_Param);
			
		}else{
			List<V_Brand> v_BrandList=v_BrandService.findAll();
			ActionContext.getContext().put("v_BrandList", v_BrandList);
		}		
		
		return "query";
	}

	public String addUI() {
		return "addUI";
	}

	public String add() {
		
		System.out.println(v_Param.getBase());
		System.out.println(v_Brand.getName());

		//v_ParamService.save(v_Param);

		v_Configure.setV_Param(v_Param);
		//v_ConfigureService.save(v_Configure);

		v_Type.getV_Configures().add(v_Configure);
		//v_TypeService.save(v_Type);

		v_Brand.getV_Types().add(v_Type);
		v_BrandService.save(v_Brand);

		msg="添加成功";
		
		return "msg";
	}

	public String compare() {

		return "compareUI";
	}

	// ---------------------------------------------------

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public V_Brand getV_Brand() {
		return v_Brand;
	}

	public void setV_Brand(V_Brand v_Brand) {
		this.v_Brand = v_Brand;
	}

	public V_Type getV_Type() {
		return v_Type;
	}

	public void setV_Type(V_Type v_Type) {
		this.v_Type = v_Type;
	}

	public V_Configure getV_Configure() {
		return v_Configure;
	}

	public void setV_Configure(V_Configure v_Configure) {
		this.v_Configure = v_Configure;
	}

	public V_Param getV_Param() {
		return v_Param;
	}

	public void setV_Param(V_Param v_Param) {
		this.v_Param = v_Param;
	}

}
