package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResCity;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResCityService {


	public void delete(ResCity resCity) ;
	
	public ResCity saveOrUpdate(ResCity resCity) ;

	public ResCity load(Long id ) ;

	
	public List<ResCity> loadAll() ;


	public List<ResCity> loadByNamedQuery(String queryName) ;

	
	public List<ResCity> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResCity> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResCity> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResCity> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResCity> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResCity> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResCity> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResCity> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResCity> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResCity> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}