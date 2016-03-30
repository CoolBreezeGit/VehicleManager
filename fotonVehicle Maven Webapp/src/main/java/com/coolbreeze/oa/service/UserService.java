package com.coolbreeze.oa.service;

import com.coolbreeze.oa.base.BaseDao;
import com.coolbreeze.oa.domain.User;

public interface UserService extends BaseDao<User>{

	User findByNameAndPasswd(String name, String passwd);

}
