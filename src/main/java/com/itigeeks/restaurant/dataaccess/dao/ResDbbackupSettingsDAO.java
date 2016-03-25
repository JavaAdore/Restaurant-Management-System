package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDbbackupSettings;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

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
	
	public List<ResDbbackupSettings> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResDbbackupSettings> loadByNamedQuery(String queryName) ;
	
	public List<ResDbbackupSettings> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResDbbackupSettings> load( Map<String, Object> criteria ) ;
	
	public List<ResDbbackupSettings> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResDbbackupSettings> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResDbbackupSettings> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResDbbackupSettings> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
