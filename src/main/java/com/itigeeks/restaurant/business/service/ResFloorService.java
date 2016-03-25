package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResFloor;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResFloorService {


	public void delete(ResFloor resFloor) ;
	
	public ResFloor saveOrUpdate(ResFloor resFloor) ;

	public ResFloor load(Long id ) ;

	
	public List<ResFloor> loadAll() ;


	public List<ResFloor> loadByNamedQuery(String queryName) ;

	
	public List<ResFloor> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResFloor> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResFloor> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResFloor> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResFloor> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResFloor> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResFloor> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResFloor> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResFloor> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResFloor> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}