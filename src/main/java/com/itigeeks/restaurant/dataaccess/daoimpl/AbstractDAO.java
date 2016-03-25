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

import com.itigeeks.restaurant.common.utils.Utils;

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
		Query query = getCurrentSession().createQuery(
				String.format("select o from %s o", class1.getCanonicalName()));
		List result = query.list();
		return result;
	}

	public List loadByNamedQuery(String queryName) {
		Query query = getCurrentSession().getNamedQuery(queryName);
		List result = query.list();
		return result;
	}

	public List loadByNamedQuery(String queryName,
			Map<String, Object> queryParameters) {
		Query query = getCurrentSession().getNamedQuery(queryName);
		if (queryParameters != null) {
			for (String key : queryParameters.keySet()) {
				query.setParameter(key, queryParameters.get(key));
			}
		}

		List result = query.list();
		return result;
	}

	public List search(Class class1, Map<String, Object> queryParameters) {
		Query query = getCurrentSession().createQuery(
				String.format("select o from %s o", class1.getCanonicalName()));
		if (queryParameters != null) {
			for (String key : queryParameters.keySet()) {
				query.setParameter(key, queryParameters.get(key));
			}
		}
		List result = query.list();
		return result;
	}

	public Integer countAll(Class class1) {
		Query query = getCurrentSession().createQuery(
				String.format("select count (o) from %s o",
						class1.getCanonicalName()));
		Object obj = Utils.getFirstResult(query.list());
		if (obj != null) {
			return ((Long) obj).intValue();
		}
		return 0;
	}

	public List search(Class class1, Map<String, Object> queryParameters,
			Integer firstPage, Integer pageSize) {

		Query query = getCurrentSession().createQuery(
				String.format("select o from %s o", class1.getCanonicalName()));
		if (queryParameters != null) {
			for (String key : queryParameters.keySet()) {
				query.setParameter(key, queryParameters.get(key));
			}
		}
		query.setFirstResult(firstPage);
		query.setFetchSize(pageSize);
		List result = query.list();
		return result;
	}

	public List loadAll(Class class1, Integer startPage, Integer pageSize) {
		Query query = getCurrentSession().createQuery(
				String.format("select o from %s o", class1.getCanonicalName()));
		query.setFirstResult(startPage);
		System.out.println("*********** start index ********* " + startPage);
		query.setMaxResults(pageSize);   
		List result = query.list();
		return result;
	}

}
