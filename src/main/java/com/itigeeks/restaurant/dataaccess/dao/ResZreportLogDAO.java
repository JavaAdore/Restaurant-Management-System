package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResZreportLog;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResZreportLogDAO {


	public void delete(ResZreportLog resZreportLog) ;
	
	public ResZreportLog saveOrUpdate(ResZreportLog resZreportLog) ;

	public ResZreportLog load(Long id ) ;

	public List<ResZreportLog> loadAll() ;
	
	public List<ResZreportLog> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResZreportLog> loadByNamedQuery(String queryName) ;
	
	public List<ResZreportLog> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResZreportLog> load( Map<String, Object> criteria ) ;
	
	public List<ResZreportLog> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResZreportLog> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResZreportLog> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResZreportLog> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
