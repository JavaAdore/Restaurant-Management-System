package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResStatus;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResStatusDAO {


	public void delete(ResStatus resStatus) ;
	
	public ResStatus saveOrUpdate(ResStatus resStatus) ;

	public ResStatus load(Long id ) ;

	public List<ResStatus> loadAll() ;
	
	public List<ResStatus> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResStatus> loadByNamedQuery(String queryName) ;
	
	public List<ResStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResStatus> load( Map<String, Object> criteria ) ;
	
	public List<ResStatus> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResStatus> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResStatus> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResStatus> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
