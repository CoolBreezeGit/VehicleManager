package com.coolbreeze.oa.domain;

/*
 * 车型基础数据
 */
public class P_Base {

	private Long id;

	/*
	指导价     
	市场报价     
	生产时间 
	发动机位置     
	驱动形式      
	综合油耗(L/100km)        
	最高车速(km/h) 
	*/   

	
	private String guidePrice;
	private String quotedMarketPrice;
	private String productionTime;
	private String EnginePosition;
	private String drivingForm;
	private String integratedFuelConsumption;
	private String maximumSpeed;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGuidePrice() {
		return guidePrice;
	}
	public void setGuidePrice(String guidePrice) {
		this.guidePrice = guidePrice;
	}
	public String getQuotedMarketPrice() {
		return quotedMarketPrice;
	}
	public void setQuotedMarketPrice(String quotedMarketPrice) {
		this.quotedMarketPrice = quotedMarketPrice;
	}
	public String getProductionTime() {
		return productionTime;
	}
	public void setProductionTime(String productionTime) {
		this.productionTime = productionTime;
	}
	public String getEnginePosition() {
		return EnginePosition;
	}
	public void setEnginePosition(String enginePosition) {
		EnginePosition = enginePosition;
	}
	public String getDrivingForm() {
		return drivingForm;
	}
	public void setDrivingForm(String drivingForm) {
		this.drivingForm = drivingForm;
	}
	public String getIntegratedFuelConsumption() {
		return integratedFuelConsumption;
	}
	public void setIntegratedFuelConsumption(String integratedFuelConsumption) {
		this.integratedFuelConsumption = integratedFuelConsumption;
	}
	public String getMaximumSpeed() {
		return maximumSpeed;
	}
	public void setMaximumSpeed(String maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}
	
	

}
