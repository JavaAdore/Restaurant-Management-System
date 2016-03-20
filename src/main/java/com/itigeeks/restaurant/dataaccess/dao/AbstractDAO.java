package com.itigeeks.restaurant.dataaccess.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AbstractDAO {

	@Autowired
	SessionFactory localSessionFactoryBean;

	public Session getCurrentSession() {
		return localSessionFactoryBean.getCurrentSession();
	}

	public Object saveOrUpdate(Object entity) {
		getCurrentSession().merge(entity);
		return entity;
	}
}
