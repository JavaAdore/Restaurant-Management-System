package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCity;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResCityDAO {


	public void delete(ResCity resCity) ;
	
	public ResCity saveOrUpdate(ResCity resCity) ;

	public ResCity load(Long id ) ;

	public List<ResCity> loadAll() ;
	
	public List<ResCity> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResCity> loadByNamedQuery(String queryName) ;
	
	public List<ResCity> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResCity> load( Map<String, Object> criteria ) ;
	
	public List<ResCity> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResCity> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResCity> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResCity> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
