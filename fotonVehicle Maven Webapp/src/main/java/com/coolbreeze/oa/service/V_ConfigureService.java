package com.coolbreeze.oa.service;

import java.util.List;

import com.coolbreeze.oa.base.BaseDao;
import com.coolbreeze.oa.domain.V_Configure;

public interface V_ConfigureService extends BaseDao<V_Configure>{

	List<V_Configure> findByTypeId(Long long1);

}
