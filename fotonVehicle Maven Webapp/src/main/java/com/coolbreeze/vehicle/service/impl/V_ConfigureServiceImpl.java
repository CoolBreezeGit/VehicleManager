package com.coolbreeze.vehicle.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coolbreeze.vehicle.base.BaseDaoImpl;
import com.coolbreeze.vehicle.domain.V_Brand;
import com.coolbreeze.vehicle.domain.V_Configure;
import com.coolbreeze.vehicle.domain.V_Type;
import com.coolbreeze.vehicle.service.V_BrandService;
import com.coolbreeze.vehicle.service.V_ConfigureService;
import com.coolbreeze.vehicle.service.V_TypeService;

@Service
public class V_ConfigureServiceImpl extends BaseDaoImpl<V_Configure> implements V_ConfigureService{

	public List<V_Configure> findByTypeId(Long typeId) {
		return getSession().createQuery("From V_Configure Where v_Type.id is ?")
				.setParameter(0, typeId)	//
				.list();		//
	}

}
