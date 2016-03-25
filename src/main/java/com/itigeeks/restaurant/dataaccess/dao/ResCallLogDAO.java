package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCallLog;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResCallLogDAO {


	public void delete(ResCallLog resCallLog) ;
	
	public ResCallLog saveOrUpdate(ResCallLog resCallLog) ;

	public ResCallLog load(Long id ) ;

	public List<ResCallLog> loadAll() ;
	
	public List<ResCallLog> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResCallLog> loadByNamedQuery(String queryName) ;
	
	public List<ResCallLog> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResCallLog> load( Map<String, Object> criteria ) ;
	
	public List<ResCallLog> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResCallLog> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResCallLog> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResCallLog> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
