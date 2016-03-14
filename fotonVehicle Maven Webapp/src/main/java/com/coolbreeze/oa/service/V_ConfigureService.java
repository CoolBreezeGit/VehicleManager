package com.coolbreeze.oa.service;

import java.util.List;

import com.coolbreeze.oa.base.BaseDao;
import com.coolbreeze.oa.domain.V_Brand;
import com.coolbreeze.oa.domain.V_Configure;
import com.coolbreeze.oa.domain.V_Type;

public interface V_ConfigureService extends BaseDao<V_Configure>{

	List<V_Type> findByTypeId(Long long1);

}
