package com.itigeeks.restaurant.dataaccess.daoimpl;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Repository
@EnableTransactionManagement 
@Transactional
public class AbstractDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void delete(Object entity) {
		 getCurrentSession().delete(entity);

	}

	public Object saveOrUpdate(Object entity) {
		  getCurrentSession().merge(entity);
		return entity;
	}

	public Object get(Class cls, Long id) {
		return getCurrentSession().get(cls, id);
	}

	public List loadAll(Class class1) {
		Query query = getCurrentSession().createQuery(String.format("select o from %s o", class1.getCanonicalName()) );
		return query.list();
	}

	public List loadByNamedQuery(String queryName) {
		Query query = getCurrentSession().getNamedQuery(queryName);
		return query.list();
	}

	public List loadByNamedQuery(String queryName,
			Map<String, Object> queryParameters) {
		Query query = getCurrentSession().getNamedQuery(queryName);
		for(String key : queryParameters.keySet())
		{
			query.setParameter(key, queryParameters.get(key));
		}
		
		return query.list();
	}

	public List search(Class class1, Map<String, Object> criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer countAll(Class class1) {
		Query query = getCurrentSession().createQuery(String.format("select count (o) from %s o", class1.getCanonicalName()) );
		 Integer count = (Integer)query.list().get(0);
		 return count;
	}

}
