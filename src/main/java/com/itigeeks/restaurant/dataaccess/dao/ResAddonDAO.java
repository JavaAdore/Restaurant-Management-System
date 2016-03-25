package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResAddon;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResAddonDAO {


	public void delete(ResAddon resAddon) ;
	
	public ResAddon saveOrUpdate(ResAddon resAddon) ;

	public ResAddon load(Long id ) ;

	public List<ResAddon> loadAll() ;
	
	public List<ResAddon> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResAddon> loadByNamedQuery(String queryName) ;
	
	public List<ResAddon> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResAddon> load( Map<String, Object> criteria ) ;
	
	public List<ResAddon> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResAddon> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResAddon> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResAddon> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
