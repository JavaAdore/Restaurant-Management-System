package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResLogType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResLogTypeDAO {


	public void delete(ResLogType resLogType) ;
	
	public ResLogType saveOrUpdate(ResLogType resLogType) ;

	public ResLogType load(Long id ) ;

	public List<ResLogType> loadAll() ;
	
	public List<ResLogType> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResLogType> loadByNamedQuery(String queryName) ;
	
	public List<ResLogType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResLogType> load( Map<String, Object> criteria ) ;
	
	public List<ResLogType> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResLogType> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResLogType> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResLogType> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
