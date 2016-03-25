package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCountry;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResCountryDAO {


	public void delete(ResCountry resCountry) ;
	
	public ResCountry saveOrUpdate(ResCountry resCountry) ;

	public ResCountry load(Long id ) ;

	public List<ResCountry> loadAll() ;
	
	public List<ResCountry> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResCountry> loadByNamedQuery(String queryName) ;
	
	public List<ResCountry> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResCountry> load( Map<String, Object> criteria ) ;
	
	public List<ResCountry> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResCountry> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResCountry> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResCountry> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
