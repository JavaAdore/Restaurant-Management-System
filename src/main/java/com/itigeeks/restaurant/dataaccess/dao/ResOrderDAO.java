package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrder;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResOrderDAO {


	public void delete(ResOrder resOrder) ;
	
	public ResOrder saveOrUpdate(ResOrder resOrder) ;

	public ResOrder load(Long id ) ;

	public List<ResOrder> loadAll() ;
	
	public List<ResOrder> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResOrder> loadByNamedQuery(String queryName) ;
	
	public List<ResOrder> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResOrder> load( Map<String, Object> criteria ) ;
	
	public List<ResOrder> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResOrder> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResOrder> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResOrder> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
