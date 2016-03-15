package com.coolbreeze.oa.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.json.annotations.JSON;
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

	public String queryUI() {

		List<V_Brand> v_BrandList = v_BrandService.findAll();
		ActionContext.getContext().put("v_BrandList", v_BrandList);

		return "queryUI";
	}

	/*
	 * json map对象
	 */
	private Map responseJson;

	public Map getResponseJson() {
		return responseJson;
	}

	public void setResponseJson(Map responseJson) {
		this.responseJson = responseJson;
		
		
	}

	//向ResponseJson中填充数据,,,???????如何抽象方法
/*	public <void setData(List list){
		Map<String, Object> map = new HashMap<String, Object>();

		List<Map<String, String>> idname = new ArrayList<Map<String, String>>();

		for (int i=0;i<list.size();i++) {
			Map<String, String> m = new HashMap<String, String>();
			m.put("id", list.get(i).getId().toString());
			m.put("name", v_Type.getName());
			idname.add(m);
		}
		map.put("list", idname);
	}*/
	
	public String query() {
		/*
		 * 返回这样形式的json：
		 */
		Map<String, Object> map = new HashMap<String, Object>();

		if (v_Brand != null) {
			List<V_Type> v_TypeList = v_TypeService.findByBrandId(v_Brand
					.getId());

			List<Map<String, String>> idname = new ArrayList<Map<String, String>>();

			for (V_Type v_Type : v_TypeList) {
				Map<String, String> m = new HashMap<String, String>();
				m.put("id", v_Type.getId().toString());
				m.put("name", v_Type.getName());
				idname.add(m);
			}
			map.put("list", idname);

		} else if (v_Type != null) {
			List<V_Configure> v_ConfigureList = v_ConfigureService
					.findByTypeId(v_Type.getId());

			List<Map<String, String>> idname = new ArrayList<Map<String, String>>();

			for (V_Configure v_Configure : v_ConfigureList) {
				Map<String, String> m = new HashMap<String, String>();
				m.put("id", v_Configure.getId().toString());
				m.put("name", v_Configure.getName());
				idname.add(m);
			}
			map.put("list", idname);

		} else if (v_Configure != null) {

		}

		this.setResponseJson(map);
		return "query";
	}

	public String addUI() {
		return "addUI";
	}

	public String add() {

		System.out.println(v_Param.getBase());
		System.out.println(v_Brand.getName());
		System.out.println(v_Type.getName());
		System.out.println(v_Configure.getName());
		// v_ParamService.save(v_Param);

		v_BrandService.save(v_Brand);
		// v_Brand.getV_Types().add(v_Type);

		v_Type.setV_Brand(v_Brand);
		v_TypeService.save(v_Type);

		v_Configure.setV_Type(v_Type);
		v_ConfigureService.save(v_Configure);

		v_Param.setV_Configure(v_Configure);
		v_ParamService.save(v_Param);

		msg = "添加成功";

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
