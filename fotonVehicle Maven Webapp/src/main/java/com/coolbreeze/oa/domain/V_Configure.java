package com.coolbreeze.oa.domain;


public class V_Configure {

	private Long id;

	private String name;

	private V_Param v_Param;	//该配置下的详细参数

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
