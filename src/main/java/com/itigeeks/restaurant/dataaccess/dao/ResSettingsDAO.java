package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResSettings;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResSettingsDAO {


	public void delete(ResSettings resSettings) ;
	
	public ResSettings saveOrUpdate(ResSettings resSettings) ;

	public ResSettings load(Long id ) ;

	
	public List<ResSettings> loadAll() ;


	public List<ResSettings> loadByNamedQuery(String queryName) ;

	
	public List<ResSettings> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResSettings> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResSettings> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResSettings> loadAll(Integer startPage , Integer pageSize ) ;

}
