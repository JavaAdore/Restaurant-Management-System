package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProductWasteHistory;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResProductWasteHistoryDAO {


	public void delete(ResProductWasteHistory resProductWasteHistory) ;
	
	public ResProductWasteHistory saveOrUpdate(ResProductWasteHistory resProductWasteHistory) ;

	public ResProductWasteHistory load(Long id ) ;

	public List<ResProductWasteHistory> loadAll() ;
	
	public List<ResProductWasteHistory> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResProductWasteHistory> loadByNamedQuery(String queryName) ;
	
	public List<ResProductWasteHistory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResProductWasteHistory> load( Map<String, Object> criteria ) ;
	
	public List<ResProductWasteHistory> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResProductWasteHistory> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResProductWasteHistory> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResProductWasteHistory> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
