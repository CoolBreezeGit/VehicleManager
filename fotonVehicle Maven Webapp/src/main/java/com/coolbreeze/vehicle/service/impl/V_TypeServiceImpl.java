package com.coolbreeze.vehicle.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coolbreeze.vehicle.base.BaseDaoImpl;
import com.coolbreeze.vehicle.domain.V_Brand;
import com.coolbreeze.vehicle.domain.V_Type;
import com.coolbreeze.vehicle.service.V_BrandService;
import com.coolbreeze.vehicle.service.V_TypeService;

@Service
public class V_TypeServiceImpl extends BaseDaoImpl<V_Type> implements V_TypeService{

	public List<V_Type> findByBrandId(Long brandId) {
		return getSession().createQuery("From V_Type Where v_Brand.id is ?")
							.setParameter(0, brandId)	//
							.list();		//
	}

}
