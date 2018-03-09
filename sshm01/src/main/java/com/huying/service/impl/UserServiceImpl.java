package com.huying.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.huying.dao.UserDao;
import com.huying.domain.User;
import com.huying.service.UserService;

@Transactional
public class UserServiceImpl implements UserService {

	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public User findById(Integer id) {
		return userDao.findById(id);
	}

}
