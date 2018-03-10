package com.huying.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.huying.dao.UserDao;
import com.huying.domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public User findById(Integer id) {
		return getHibernateTemplate().get(User.class, id);
	}

}
