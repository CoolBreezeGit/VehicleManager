package com.coolbreeze.vehicle.service.impl;

import org.springframework.stereotype.Service;

import com.coolbreeze.vehicle.base.BaseDaoImpl;
import com.coolbreeze.vehicle.domain.V_Param;
import com.coolbreeze.vehicle.service.V_ParamService;

@Service
public class V_ParamServiceImpl extends BaseDaoImpl<V_Param> implements V_ParamService{

	@Override
	public V_Param findByConfigureId(Long id) {
		return (V_Param) getSession().createQuery("From V_Param Where v_Configure.id=?").setParameter(0, id).uniqueResult();
	}

}
