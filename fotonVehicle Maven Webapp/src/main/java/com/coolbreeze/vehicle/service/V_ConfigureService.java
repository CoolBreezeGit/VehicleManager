package com.coolbreeze.vehicle.service;

import java.util.List;

import com.coolbreeze.vehicle.base.BaseDao;
import com.coolbreeze.vehicle.domain.V_Configure;

public interface V_ConfigureService extends BaseDao<V_Configure>{

	List<V_Configure> findByTypeId(Long long1);

}
