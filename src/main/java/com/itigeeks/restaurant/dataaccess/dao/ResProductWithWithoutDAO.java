package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProductWithWithout;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResProductWithWithoutDAO {


	public void delete(ResProductWithWithout resProductWithWithout) ;
	
	public ResProductWithWithout saveOrUpdate(ResProductWithWithout resProductWithWithout) ;

	public ResProductWithWithout load(Long id ) ;

	public List<ResProductWithWithout> loadAll() ;
	
	public List<ResProductWithWithout> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResProductWithWithout> loadByNamedQuery(String queryName) ;
	
	public List<ResProductWithWithout> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResProductWithWithout> load( Map<String, Object> criteria ) ;
	
	public List<ResProductWithWithout> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResProductWithWithout> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResProductWithWithout> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResProductWithWithout> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
