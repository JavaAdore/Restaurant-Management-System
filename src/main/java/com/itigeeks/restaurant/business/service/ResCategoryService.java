package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResCategory;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResCategoryService {


	public void delete(ResCategory resCategory) ;
	
	public ResCategory saveOrUpdate(ResCategory resCategory) ;

	public ResCategory load(Long id ) ;

	
	public List<ResCategory> loadAll() ;


	public List<ResCategory> loadByNamedQuery(String queryName) ;

	
	public List<ResCategory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResCategory> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResCategory> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResCategory> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResCategory> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResCategory> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResCategory> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResCategory> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResCategory> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResCategory> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}