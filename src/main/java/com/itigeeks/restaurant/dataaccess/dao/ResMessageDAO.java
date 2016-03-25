package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResMessage;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResMessageDAO {


	public void delete(ResMessage resMessage) ;
	
	public ResMessage saveOrUpdate(ResMessage resMessage) ;

	public ResMessage load(Long id ) ;

	public List<ResMessage> loadAll() ;
	
	public List<ResMessage> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResMessage> loadByNamedQuery(String queryName) ;
	
	public List<ResMessage> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResMessage> load( Map<String, Object> criteria ) ;
	
	public List<ResMessage> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResMessage> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResMessage> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResMessage> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
