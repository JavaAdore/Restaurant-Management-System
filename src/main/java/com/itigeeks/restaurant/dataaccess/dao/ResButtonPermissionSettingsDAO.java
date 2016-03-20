package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResButtonPermissionSettings;

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


	public List<ResButtonPermissionSettings> loadByNamedQuery(String queryName) ;

	
	public List<ResButtonPermissionSettings> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResButtonPermissionSettings> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
