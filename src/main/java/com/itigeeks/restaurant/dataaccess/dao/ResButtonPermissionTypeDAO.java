package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResButtonPermissionType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResButtonPermissionTypeDAO {


	public void delete(ResButtonPermissionType resButtonPermissionType) ;
	
	public ResButtonPermissionType saveOrUpdate(ResButtonPermissionType resButtonPermissionType) ;

	public ResButtonPermissionType load(Long id ) ;

	public List<ResButtonPermissionType> loadAll() ;
	
	public List<ResButtonPermissionType> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResButtonPermissionType> loadByNamedQuery(String queryName) ;
	
	public List<ResButtonPermissionType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResButtonPermissionType> load( Map<String, Object> criteria ) ;
	
	public List<ResButtonPermissionType> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResButtonPermissionType> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResButtonPermissionType> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResButtonPermissionType> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
