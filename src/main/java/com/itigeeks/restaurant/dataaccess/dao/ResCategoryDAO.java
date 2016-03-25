package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCategory;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResCategoryDAO {


	public void delete(ResCategory resCategory) ;
	
	public ResCategory saveOrUpdate(ResCategory resCategory) ;

	public ResCategory load(Long id ) ;

	public List<ResCategory> loadAll() ;
	
	public List<ResCategory> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResCategory> loadByNamedQuery(String queryName) ;
	
	public List<ResCategory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResCategory> load( Map<String, Object> criteria ) ;
	
	public List<ResCategory> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResCategory> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResCategory> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResCategory> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
