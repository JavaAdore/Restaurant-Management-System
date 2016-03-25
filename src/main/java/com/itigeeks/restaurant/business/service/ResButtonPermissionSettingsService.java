package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResButtonPermissionSettings;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResButtonPermissionSettingsService {


	public void delete(ResButtonPermissionSettings resButtonPermissionSettings) ;
	
	public ResButtonPermissionSettings saveOrUpdate(ResButtonPermissionSettings resButtonPermissionSettings) ;

	public ResButtonPermissionSettings load(Long id ) ;

	
	public List<ResButtonPermissionSettings> loadAll() ;


	public List<ResButtonPermissionSettings> loadByNamedQuery(String queryName) ;

	
	public List<ResButtonPermissionSettings> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResButtonPermissionSettings> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResButtonPermissionSettings> search( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResButtonPermissionSettings> loadAll(Integer startPage , Integer pageSize ) ;

}