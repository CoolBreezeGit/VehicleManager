package com.coolbreeze.vehicle.service.impl;

import org.springframework.stereotype.Service;

import com.coolbreeze.vehicle.base.BaseDaoImpl;
import com.coolbreeze.vehicle.domain.User;
import com.coolbreeze.vehicle.service.UserService;

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
