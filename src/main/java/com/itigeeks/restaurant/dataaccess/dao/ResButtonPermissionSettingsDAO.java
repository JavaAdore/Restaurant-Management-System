package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResButtonPermissionSettings;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResButtonPermissionSettingsDAO {


	public void delete(ResButtonPermissionSettings resButtonPermissionSettings) ;
	
	public ResButtonPermissionSettings saveOrUpdate(ResButtonPermissionSettings resButtonPermissionSettings) ;

	public ResButtonPermissionSettings load(Long id ) ;

	public List<ResButtonPermissionSettings> loadAll() ;
	
	public List<ResButtonPermissionSettings> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResButtonPermissionSettings> loadByNamedQuery(String queryName) ;
	
	public List<ResButtonPermissionSettings> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResButtonPermissionSettings> load( Map<String, Object> criteria ) ;
	
	public List<ResButtonPermissionSettings> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResButtonPermissionSettings> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResButtonPermissionSettings> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResButtonPermissionSettings> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
