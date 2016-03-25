package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResNumberIdentifier;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResNumberIdentifierService {


	public void delete(ResNumberIdentifier resNumberIdentifier) ;
	
	public ResNumberIdentifier saveOrUpdate(ResNumberIdentifier resNumberIdentifier) ;

	public ResNumberIdentifier load(Long id ) ;

	
	public List<ResNumberIdentifier> loadAll() ;


	public List<ResNumberIdentifier> loadByNamedQuery(String queryName) ;

	
	public List<ResNumberIdentifier> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResNumberIdentifier> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResNumberIdentifier> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResNumberIdentifier> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResNumberIdentifier> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResNumberIdentifier> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResNumberIdentifier> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResNumberIdentifier> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResNumberIdentifier> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResNumberIdentifier> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}