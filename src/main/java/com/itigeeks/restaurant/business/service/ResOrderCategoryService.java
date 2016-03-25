package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResOrderCategory;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResOrderCategoryService {


	public void delete(ResOrderCategory resOrderCategory) ;
	
	public ResOrderCategory saveOrUpdate(ResOrderCategory resOrderCategory) ;

	public ResOrderCategory load(Long id ) ;

	
	public List<ResOrderCategory> loadAll() ;


	public List<ResOrderCategory> loadByNamedQuery(String queryName) ;

	
	public List<ResOrderCategory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResOrderCategory> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResOrderCategory> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResOrderCategory> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResOrderCategory> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResOrderCategory> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResOrderCategory> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResOrderCategory> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResOrderCategory> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResOrderCategory> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}