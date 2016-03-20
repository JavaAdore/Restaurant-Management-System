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
	
	
	public List<ResZreportPermission> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}