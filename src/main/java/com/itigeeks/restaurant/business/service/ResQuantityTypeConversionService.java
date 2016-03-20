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
	
	
	public List<ResQuantityTypeConversion> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}