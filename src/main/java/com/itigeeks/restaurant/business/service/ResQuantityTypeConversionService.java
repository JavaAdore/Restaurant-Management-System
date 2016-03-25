package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResQuantityTypeConversion;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResQuantityTypeConversionService {


	public void delete(ResQuantityTypeConversion resQuantityTypeConversion) ;
	
	public ResQuantityTypeConversion saveOrUpdate(ResQuantityTypeConversion resQuantityTypeConversion) ;

	public ResQuantityTypeConversion load(Long id ) ;

	
	public List<ResQuantityTypeConversion> loadAll() ;


	public List<ResQuantityTypeConversion> loadByNamedQuery(String queryName) ;

	
	public List<ResQuantityTypeConversion> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResQuantityTypeConversion> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResQuantityTypeConversion> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResQuantityTypeConversion> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResQuantityTypeConversion> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResQuantityTypeConversion> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResQuantityTypeConversion> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResQuantityTypeConversion> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResQuantityTypeConversion> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResQuantityTypeConversion> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}