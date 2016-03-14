package com.coolbreeze.oa.domain;

/**
 * 实体：车详细参数
 */
public class V_Param {

	private Long id;

	private V_Configure v_Configure;	//对应的配置

	public V_Configure getV_Configure() {
		return v_Configure;
	}

	public void setV_Configure(V_Configure v_Configure) {
		this.v_Configure = v_Configure;
	}

	// 显示字段-------------------------------------------------------------------------
	// 基本参数
	private String base;

	// 车身参数
	private String body;

	// 发动机参数
	private String engine;

	// 底盘参数
	private String chassis;

	// 操控配置参数
	private String control;

	// 外观参数
	private String appearance;

	// 内饰配置参数
	private String interior;

	// 座椅配置参数
	private String chair;

	// 空调/冰箱控制参数
	private String airconditioner;

	// 安全配置参数
	private String security;

	// 多媒体配置参数
	private String multimedia;

	// 高科技配置参数
	private String hightech;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getChassis() {
		return chassis;
	}

	public void setChassis(String chassis) {
		this.chassis = chassis;
	}

	public String getControl() {
		return control;
	}

	public void setControl(String control) {
		this.control = control;
	}

	public String getAppearance() {
		return appearance;
	}

	public void setAppearance(String appearance) {
		this.appearance = appearance;
	}

	public String getInterior() {
		return interior;
	}

	public void setInterior(String interior) {
		this.interior = interior;
	}

	public String getChair() {
		return chair;
	}

	public void setChair(String chair) {
		this.chair = chair;
	}

	public String getAirconditioner() {
		return airconditioner;
	}

	public void setAirconditioner(String airconditioner) {
		this.airconditioner = airconditioner;
	}

	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	public String getMultimedia() {
		return multimedia;
	}

	public void setMultimedia(String multimedia) {
		this.multimedia = multimedia;
	}

	public String getHightech() {
		return hightech;
	}

	public void setHightech(String hightech) {
		this.hightech = hightech;
	}

}
