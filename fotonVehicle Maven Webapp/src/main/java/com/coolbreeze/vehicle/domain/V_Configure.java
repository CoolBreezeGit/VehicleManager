package com.coolbreeze.vehicle.domain;

public class V_Configure {

	private Long id;

	private String name;

	private V_Type v_Type;	//对应的车型

	private V_Param v_Param; // 该配置下的详细参数

	public V_Type getV_Type() {
		return v_Type;
	}

	public void setV_Type(V_Type v_Type) {
		this.v_Type = v_Type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public V_Param getV_Param() {
		return v_Param;
	}

	public void setV_Param(V_Param v_Param) {
		this.v_Param = v_Param;
	}

}
