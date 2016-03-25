package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResMac;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResMacService {


	public void delete(ResMac resMac) ;
	
	public ResMac saveOrUpdate(ResMac resMac) ;

	public ResMac load(Long id ) ;

	
	public List<ResMac> loadAll() ;


	public List<ResMac> loadByNamedQuery(String queryName) ;

	
	public List<ResMac> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResMac> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResMac> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResMac> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResMac> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResMac> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResMac> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResMac> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResMac> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResMac> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}