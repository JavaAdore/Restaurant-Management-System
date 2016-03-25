package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResQuantityTypeConversion;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResQuantityTypeConversionDAO {


	public void delete(ResQuantityTypeConversion resQuantityTypeConversion) ;
	
	public ResQuantityTypeConversion saveOrUpdate(ResQuantityTypeConversion resQuantityTypeConversion) ;

	public ResQuantityTypeConversion load(Long id ) ;

	public List<ResQuantityTypeConversion> loadAll() ;
	
	public List<ResQuantityTypeConversion> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResQuantityTypeConversion> loadByNamedQuery(String queryName) ;
	
	public List<ResQuantityTypeConversion> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResQuantityTypeConversion> load( Map<String, Object> criteria ) ;
	
	public List<ResQuantityTypeConversion> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResQuantityTypeConversion> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResQuantityTypeConversion> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResQuantityTypeConversion> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
