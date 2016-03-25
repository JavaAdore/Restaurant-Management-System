package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResUserType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResUserTypeService {


	public void delete(ResUserType resUserType) ;
	
	public ResUserType saveOrUpdate(ResUserType resUserType) ;

	public ResUserType load(Long id ) ;

	
	public List<ResUserType> loadAll() ;


	public List<ResUserType> loadByNamedQuery(String queryName) ;

	
	public List<ResUserType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResUserType> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResUserType> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResUserType> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResUserType> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResUserType> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResUserType> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResUserType> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResUserType> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResUserType> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}