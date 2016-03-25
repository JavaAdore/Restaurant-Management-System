package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResLog;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResLogDAO {


	public void delete(ResLog resLog) ;
	
	public ResLog saveOrUpdate(ResLog resLog) ;

	public ResLog load(Long id ) ;

	public List<ResLog> loadAll() ;
	
	public List<ResLog> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResLog> loadByNamedQuery(String queryName) ;
	
	public List<ResLog> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResLog> load( Map<String, Object> criteria ) ;
	
	public List<ResLog> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResLog> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResLog> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResLog> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
