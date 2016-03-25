package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResCountry;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResCountryService {


	public void delete(ResCountry resCountry) ;
	
	public ResCountry saveOrUpdate(ResCountry resCountry) ;

	public ResCountry load(Long id ) ;

	
	public List<ResCountry> loadAll() ;


	public List<ResCountry> loadByNamedQuery(String queryName) ;

	
	public List<ResCountry> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResCountry> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResCountry> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResCountry> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResCountry> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResCountry> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResCountry> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResCountry> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResCountry> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResCountry> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}