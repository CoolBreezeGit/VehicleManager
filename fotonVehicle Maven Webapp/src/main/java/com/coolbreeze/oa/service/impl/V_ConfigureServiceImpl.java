package com.coolbreeze.oa.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coolbreeze.oa.base.BaseDaoImpl;
import com.coolbreeze.oa.domain.V_Brand;
import com.coolbreeze.oa.domain.V_Configure;
import com.coolbreeze.oa.domain.V_Type;
import com.coolbreeze.oa.service.V_BrandService;
import com.coolbreeze.oa.service.V_ConfigureService;
import com.coolbreeze.oa.service.V_TypeService;

@Service
public class V_ConfigureServiceImpl extends BaseDaoImpl<V_Configure> implements V_ConfigureService{

	public List<V_Type> findByTypeId(Long typeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
