package com.coolbreeze.oa.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.coolbreeze.fotonVehicle.utils.MyBeanUtils;
import com.coolbreeze.oa.domain.V_Brand;
import com.coolbreeze.oa.domain.V_Configure;
import com.coolbreeze.oa.domain.V_Param;
import com.coolbreeze.oa.domain.V_Type;
import com.coolbreeze.oa.service.V_BrandService;
import com.coolbreeze.oa.service.V_ConfigureService;
import com.coolbreeze.oa.service.V_ParamService;
import com.coolbreeze.oa.service.V_TypeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

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

	public String queryAndCompareUI() {

		List<V_Brand> v_BrandList = v_BrandService.findAll();
		ActionContext.getContext().put("v_BrandList", v_BrandList);

		return "queryAndCompareUI";
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
			this.setResponseJson(map);

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
			this.setResponseJson(map);

		} else if (v_Configure != null) {
			V_Param v_Param = v_ParamService.findByConfigureId(v_Configure
					.getId());

			// 将v_Param 封装成Map
			this.setResponseJson(MyBeanUtils.v_ParamToMap(v_Param));
			// System.out.println(this.responseJson.get("id"));

		}

		return "query";
	}

	public String addUI() {

		List<V_Brand> v_BrandList = v_BrandService.findAll();
		ActionContext.getContext().put("v_BrandList", v_BrandList);

		return "addUI";
	}

	public String add() {

		// 新添加了品牌
		if (v_Brand.getId() == null) {
			v_BrandService.save(v_Brand);
			// 必然要新添加车型
			v_Type.setV_Brand(v_Brand);
			v_TypeService.save(v_Type);

			v_Configure.setV_Type(v_Type);

		} else { // 使用原来的品牌
			// 新添加了车型
			if (v_Type.getId() == null) {
				v_Type.setV_Brand(v_BrandService.getById(v_Brand.getId()));
				v_TypeService.save(v_Type);
				v_Configure.setV_Type(v_Type);

			} else { // 使用原来的车型
				v_Configure.setV_Type(v_TypeService.getById(v_Type.getId()));
			}
		}

		v_ConfigureService.save(v_Configure);

		v_Param.setV_Configure(v_Configure);
		v_ParamService.save(v_Param);

		msg = "添加成功";

		return "msg";
	}

	/*
	 * 修改UI
	 */
	public String editUI() {

		List<V_Brand> v_BrandList = v_BrandService.findAll();
		ActionContext.getContext().put("v_BrandList", v_BrandList);

		return "editUI";
	}

	/*
	 * 修改
	 */
	public String edit() {

		return "edit";
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
