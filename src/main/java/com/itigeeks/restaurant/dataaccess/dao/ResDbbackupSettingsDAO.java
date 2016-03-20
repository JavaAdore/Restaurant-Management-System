package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDbbackupSettings;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResDbbackupSettingsDAO {


	public void delete(ResDbbackupSettings resDbbackupSettings) ;
	
	public ResDbbackupSettings saveOrUpdate(ResDbbackupSettings resDbbackupSettings) ;

	public ResDbbackupSettings load(Long id ) ;

	
	public List<ResDbbackupSettings> loadAll() ;


	public List<ResDbbackupSettings> loadByNamedQuery(String queryName) ;

	
	public List<ResDbbackupSettings> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResDbbackupSettings> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
