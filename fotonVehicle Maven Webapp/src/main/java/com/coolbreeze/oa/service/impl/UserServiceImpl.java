package com.coolbreeze.oa.service.impl;

import org.springframework.stereotype.Service;

import com.coolbreeze.oa.base.BaseDaoImpl;
import com.coolbreeze.oa.domain.User;
import com.coolbreeze.oa.service.UserService;

@Service
public class UserServiceImpl extends BaseDaoImpl<User> implements UserService{

	@Override
	public User findByNameAndPasswd(String name, String passwd) {
		return	(User) getSession().createQuery("From User Where name=? And password=?")	//
				.setParameter(0, name)	//
				.setParameter(1, passwd)	//
				.uniqueResult();
	}


}
