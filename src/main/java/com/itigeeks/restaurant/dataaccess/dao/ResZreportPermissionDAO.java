package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResZreportPermission;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResZreportPermissionDAO {


	public void delete(ResZreportPermission resZreportPermission) ;
	
	public ResZreportPermission saveOrUpdate(ResZreportPermission resZreportPermission) ;

	public ResZreportPermission load(Long id ) ;

	public List<ResZreportPermission> loadAll() ;
	
	public List<ResZreportPermission> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResZreportPermission> loadByNamedQuery(String queryName) ;
	
	public List<ResZreportPermission> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResZreportPermission> load( Map<String, Object> criteria ) ;
	
	public List<ResZreportPermission> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResZreportPermission> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResZreportPermission> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResZreportPermission> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
