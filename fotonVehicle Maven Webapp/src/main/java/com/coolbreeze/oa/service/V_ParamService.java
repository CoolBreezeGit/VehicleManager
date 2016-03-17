package com.coolbreeze.oa.service;

import com.coolbreeze.oa.base.BaseDao;
import com.coolbreeze.oa.domain.V_Param;

public interface V_ParamService extends BaseDao<V_Param>{

	V_Param findByConfigureId(Long id);

}
