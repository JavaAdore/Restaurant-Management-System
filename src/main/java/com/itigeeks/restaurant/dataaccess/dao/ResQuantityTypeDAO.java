package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResQuantityType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResQuantityTypeDAO {


	public void delete(ResQuantityType resQuantityType) ;
	
	public ResQuantityType saveOrUpdate(ResQuantityType resQuantityType) ;

	public ResQuantityType load(Long id ) ;

	public List<ResQuantityType> loadAll() ;
	
	public List<ResQuantityType> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResQuantityType> loadByNamedQuery(String queryName) ;
	
	public List<ResQuantityType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResQuantityType> load( Map<String, Object> criteria ) ;
	
	public List<ResQuantityType> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResQuantityType> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResQuantityType> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResQuantityType> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
