package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResQuantityType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResQuantityTypeService {


	public void delete(ResQuantityType resQuantityType) ;
	
	public ResQuantityType saveOrUpdate(ResQuantityType resQuantityType) ;

	public ResQuantityType load(Long id ) ;

	
	public List<ResQuantityType> loadAll() ;


	public List<ResQuantityType> loadByNamedQuery(String queryName) ;

	
	public List<ResQuantityType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResQuantityType> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResQuantityType> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResQuantityType> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResQuantityType> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResQuantityType> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResQuantityType> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResQuantityType> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResQuantityType> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResQuantityType> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}