package com.coolbreeze.oa.domain;

/**
 * 实体：车详细参数
 */
public class V_Param {

	private Long id;

	// 基本参数
	private P_Base p_Base;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public P_Base getP_Base() {
		return p_Base;
	}

	public void setP_Base(P_Base p_Base) {
		this.p_Base = p_Base;
	}

}
