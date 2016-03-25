package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResOrderProductAddon;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResOrderProductAddonService {


	public void delete(ResOrderProductAddon resOrderProductAddon) ;
	
	public ResOrderProductAddon saveOrUpdate(ResOrderProductAddon resOrderProductAddon) ;

	public ResOrderProductAddon load(Long id ) ;

	
	public List<ResOrderProductAddon> loadAll() ;


	public List<ResOrderProductAddon> loadByNamedQuery(String queryName) ;

	
	public List<ResOrderProductAddon> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResOrderProductAddon> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResOrderProductAddon> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResOrderProductAddon> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResOrderProductAddon> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResOrderProductAddon> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResOrderProductAddon> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResOrderProductAddon> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResOrderProductAddon> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResOrderProductAddon> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}