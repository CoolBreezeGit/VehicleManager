package com.coolbreeze.vehicle.service;

import java.util.List;

import com.coolbreeze.vehicle.base.BaseDao;
import com.coolbreeze.vehicle.domain.V_Brand;
import com.coolbreeze.vehicle.domain.V_Param;
import com.coolbreeze.vehicle.domain.V_Type;

public interface V_TypeService extends BaseDao<V_Type>{

	List<V_Type> findByBrandId(Long long1);

}
