package com.coolbreeze.oa.domain;

import java.util.HashSet;
import java.util.Set;

/*
 * 品牌
 */
public class V_Brand {
	private Long id;

	private String name;

	private Set<V_Type> v_Types=new HashSet<V_Type>();	//该品牌下的车型

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<V_Type> getV_Types() {
		return v_Types;
	}

	public void setV_Types(Set<V_Type> v_Types) {
		this.v_Types = v_Types;
	}

}
