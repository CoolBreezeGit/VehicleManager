package com.coolbreeze.vehicle.service;

import com.coolbreeze.vehicle.base.BaseDao;
import com.coolbreeze.vehicle.domain.V_Param;

public interface V_ParamService extends BaseDao<V_Param>{

	V_Param findByConfigureId(Long id);

}
