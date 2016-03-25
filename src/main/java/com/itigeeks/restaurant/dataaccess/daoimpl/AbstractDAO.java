package com.itigeeks.restaurant.dataaccess.daoimpl;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.itigeeks.restaurant.common.dto.CustomCriteria;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.common.utils.Utils;

@Repository
@EnableTransactionManagement
@Transactional
public class AbstractDAO {

	private static final String ALIAS = "o";
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
		return lazyLoadEntities(class1, startPage, pageSize, null, false, null,
				QueryConjunctionType.AND);
	}

	@SuppressWarnings("rawtypes")
	private Query prepareLazyLoadingQuery(Class clz, Integer first,
			Integer pageSize, String sortField, Boolean ascending,
			Map<String, Object> filters, Boolean count,
			QueryConjunctionType conjuncationType) {
		StringBuilder stringBuilder = new StringBuilder();
		String conjuncation = conjuncationType  !=null ?  conjuncationType.name() : " AND ";
		if (count) {
			stringBuilder.append(String.format(
					"select count( o ) from %s o where 1=1 ",
					clz.getCanonicalName()));
		} else {
			stringBuilder.append(String.format("select o from %s o where 1=1 ",
					clz.getCanonicalName()));
		}
		int counter = 1;
		Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
		if (filters != null) { 
			for (String field : filters.keySet()) {
				Object filterValue = filters.get(field);
				Class fieldClass = Utils.getFilterClass(field, clz);
				String alias = null;
				alias = Utils.dublicate(ALIAS, ++counter);

				if (fieldClass == String.class) {

					if (filterValue instanceof CustomCriteria) {

						stringBuilder.append(String.format(" %s  o.%s  ",
								conjuncation, field, ((CustomCriteria) filters
										.get(field)).getCriteria()));

					} else {
						stringBuilder
								.append(String
										.format("%s lower( o.%s ) like lower( CONCAT(  :%s ,'%s')   ) ",
												conjuncation, field, alias, "%"));

						queryParams.put(alias, ((String) filterValue).trim());
					}

				} else if (Utils.isPrimitiveDataType(fieldClass)) {
					if (filterValue instanceof CustomCriteria) {

						stringBuilder.append(String.format(" %s  o.%s  %s ",
								conjuncation, field, ((CustomCriteria) filters
										.get(field)).getCriteria()));

					} else {

						if (Utils.isAString(filterValue)
								|| filterValue.getClass().isPrimitive()
								|| Utils.isWrapperType(filterValue.getClass())) {
							Object object = Utils.initiatePrimitiveObject(
									fieldClass, String.valueOf(filterValue));
							stringBuilder.append(String.format(
									" %s o.%s =:%s ", conjuncation, field,
									alias));
							queryParams.put(alias, object);
						}
					}
				} else if (fieldClass == Date.class) {
					if (filterValue instanceof CustomCriteria) {

						stringBuilder.append(String.format(" %  o.%s   %s ",
								conjuncation, field, ((CustomCriteria) filters
										.get(field)).getCriteria()));

					} else {
						String secondAlias = Utils.dublicate(alias, ++counter);
						stringBuilder.append(String.format(
								" %s o.%s BETWEEN  :%s and  :%s ",
								conjuncation, field, alias, secondAlias));
						Date startDate = Utils
								.getStartOfDay((Date) filterValue);
						Date endDate = Utils.getEndOfDay((Date) filterValue);
						queryParams.put(alias, startDate);
						queryParams.put(secondAlias, endDate);
					}
				} else {
					if (filterValue instanceof CustomCriteria) {

						stringBuilder.append(String.format(" %s  o.%s   %s ",
								conjuncation, field, ((CustomCriteria) filters
										.get(field)).getCriteria()));

					} else {
						stringBuilder.append(String.format(" %s  o.%s =:%s ",
								conjuncation, field, alias));
						queryParams.put(alias, filters.get(field));
					}
				}

			}
		}

		if (Utils.isNotEmptyString(sortField) && Utils.isNotNull(ascending)) {
			stringBuilder.append(String.format(" order by %s %s", sortField,
					ascending == false ? "desc " : ""));
		}
		Query query = getCurrentSession().createQuery(stringBuilder.toString());

		for (String alia : queryParams.keySet()) {

			query.setParameter(alia, queryParams.get(alia));

		}
		return query;

	}

	public Integer getCountOfResults(Class clz, Map<String, Object> filters,
			QueryConjunctionType conjuncationType) {
		Query query = prepareLazyLoadingQuery(clz, null, null, null, false,
				filters, true, conjuncationType);
		return ((Long) Utils.getFirstResult(query.list())).intValue();
	}

	public Integer getCount(Class class1, Map<String, Object> criteria,
			QueryConjunctionType conjuncationType) {
		return getCountOfResults(class1, criteria, conjuncationType);
	}

	public List load(Class class1, Map<String, Object> criteria,
			Integer startPage, Integer pageSize, String sortField,
			Boolean ascending, QueryConjunctionType conjuncationType) {

		return lazyLoadEntities(class1, startPage, pageSize, sortField,
				ascending, criteria, conjuncationType);
	}

	public List load(Class class1, Map<String, Object> criteria,
			QueryConjunctionType conjuncationType) {

		return lazyLoadEntities(class1, null, null, null, false, criteria,
				conjuncationType);
	}

	@SuppressWarnings("rawtypes")
	public List lazyLoadEntities(Class clz, Integer first, Integer pageSize,
			String sortField, Boolean assending, Map<String, Object> filters,
			QueryConjunctionType queryConjunctionType) {
		Query query = prepareLazyLoadingQuery(clz, first, pageSize, sortField,
				assending, filters, false, queryConjunctionType);
		if (first != null && pageSize != null) {
			query.setFirstResult(first);
			query.setMaxResults(pageSize);
		}
		List result = query.list();
		return result;
	}
}
