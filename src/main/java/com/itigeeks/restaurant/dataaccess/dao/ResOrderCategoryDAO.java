package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderCategory;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResOrderCategoryDAO {


	public void delete(ResOrderCategory resOrderCategory) ;
	
	public ResOrderCategory saveOrUpdate(ResOrderCategory resOrderCategory) ;

	public ResOrderCategory load(Long id ) ;

	public List<ResOrderCategory> loadAll() ;
	
	public List<ResOrderCategory> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResOrderCategory> loadByNamedQuery(String queryName) ;
	
	public List<ResOrderCategory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResOrderCategory> load( Map<String, Object> criteria ) ;
	
	public List<ResOrderCategory> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResOrderCategory> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResOrderCategory> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResOrderCategory> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
