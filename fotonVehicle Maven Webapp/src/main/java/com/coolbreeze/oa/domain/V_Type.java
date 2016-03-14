package com.coolbreeze.oa.domain;

import java.util.HashSet;
import java.util.Set;

/*
 * 车型
 */
public class V_Type {

	private Long id;

	private String name;

	private V_Brand v_Brand;		//对应的品牌

	private Set<V_Configure> v_Configures = new HashSet<V_Configure>(); // 该车型下的车型配置

	public V_Brand getV_Brand() {
		return v_Brand;
	}

	public void setV_Brand(V_Brand v_Brand) {
		this.v_Brand = v_Brand;
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

	public Set<V_Configure> getV_Configures() {
		return v_Configures;
	}

	public void setV_Configures(Set<V_Configure> v_Configures) {
		this.v_Configures = v_Configures;
	}

}
