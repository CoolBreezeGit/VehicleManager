package com.coolbreeze.oa.service;

import java.util.List;

import com.coolbreeze.oa.base.BaseDao;
import com.coolbreeze.oa.domain.V_Brand;
import com.coolbreeze.oa.domain.V_Param;
import com.coolbreeze.oa.domain.V_Type;

public interface V_TypeService extends BaseDao<V_Type>{

	List<V_Type> findByBrandId(Long long1);

}
