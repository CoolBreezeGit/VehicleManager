package com.coolbreeze.oa.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coolbreeze.oa.base.BaseDaoImpl;
import com.coolbreeze.oa.domain.V_Brand;
import com.coolbreeze.oa.domain.V_Type;
import com.coolbreeze.oa.service.V_BrandService;
import com.coolbreeze.oa.service.V_TypeService;

@Service
public class V_TypeServiceImpl extends BaseDaoImpl<V_Type> implements V_TypeService{

	public List<V_Type> findByBrandId(Long brandId) {
		// TODO Auto-generated method stub
		return null;
	}

}
