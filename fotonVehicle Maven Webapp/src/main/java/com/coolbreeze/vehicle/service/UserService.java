package com.coolbreeze.vehicle.service;

import com.coolbreeze.vehicle.base.BaseDao;
import com.coolbreeze.vehicle.domain.User;

public interface UserService extends BaseDao<User>{

	User findByNameAndPasswd(String name, String passwd);

}
