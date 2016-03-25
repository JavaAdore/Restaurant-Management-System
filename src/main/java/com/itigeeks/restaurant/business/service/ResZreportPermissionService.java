package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResZreportPermission;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResZreportPermissionService {


	public void delete(ResZreportPermission resZreportPermission) ;
	
	public ResZreportPermission saveOrUpdate(ResZreportPermission resZreportPermission) ;

	public ResZreportPermission load(Long id ) ;

	
	public List<ResZreportPermission> loadAll() ;


	public List<ResZreportPermission> loadByNamedQuery(String queryName) ;

	
	public List<ResZreportPermission> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResZreportPermission> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResZreportPermission> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResZreportPermission> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResZreportPermission> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResZreportPermission> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResZreportPermission> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResZreportPermission> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResZreportPermission> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResZreportPermission> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}