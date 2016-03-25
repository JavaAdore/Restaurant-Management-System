package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResUserType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResUserTypeDAO {


	public void delete(ResUserType resUserType) ;
	
	public ResUserType saveOrUpdate(ResUserType resUserType) ;

	public ResUserType load(Long id ) ;

	public List<ResUserType> loadAll() ;
	
	public List<ResUserType> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResUserType> loadByNamedQuery(String queryName) ;
	
	public List<ResUserType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResUserType> load( Map<String, Object> criteria ) ;
	
	public List<ResUserType> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResUserType> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResUserType> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResUserType> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
