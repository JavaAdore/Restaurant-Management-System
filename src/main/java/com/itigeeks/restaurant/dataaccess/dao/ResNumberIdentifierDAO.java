package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResNumberIdentifier;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResNumberIdentifierDAO {


	public void delete(ResNumberIdentifier resNumberIdentifier) ;
	
	public ResNumberIdentifier saveOrUpdate(ResNumberIdentifier resNumberIdentifier) ;

	public ResNumberIdentifier load(Long id ) ;

	public List<ResNumberIdentifier> loadAll() ;
	
	public List<ResNumberIdentifier> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResNumberIdentifier> loadByNamedQuery(String queryName) ;
	
	public List<ResNumberIdentifier> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResNumberIdentifier> load( Map<String, Object> criteria ) ;
	
	public List<ResNumberIdentifier> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResNumberIdentifier> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResNumberIdentifier> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResNumberIdentifier> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
