package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResCallLog;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResCallLogService {


	public void delete(ResCallLog resCallLog) ;
	
	public ResCallLog saveOrUpdate(ResCallLog resCallLog) ;

	public ResCallLog load(Long id ) ;

	
	public List<ResCallLog> loadAll() ;


	public List<ResCallLog> loadByNamedQuery(String queryName) ;

	
	public List<ResCallLog> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResCallLog> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}