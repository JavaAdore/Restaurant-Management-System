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
	
	
	public List<ResFloor> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}