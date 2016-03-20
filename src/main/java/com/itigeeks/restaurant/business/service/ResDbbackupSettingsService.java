package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResDbbackupSettings;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResDbbackupSettingsService {


	public void delete(ResDbbackupSettings resDbbackupSettings) ;
	
	public ResDbbackupSettings saveOrUpdate(ResDbbackupSettings resDbbackupSettings) ;

	public ResDbbackupSettings load(Long id ) ;

	
	public List<ResDbbackupSettings> loadAll() ;


	public List<ResDbbackupSettings> loadByNamedQuery(String queryName) ;

	
	public List<ResDbbackupSettings> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResDbbackupSettings> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}