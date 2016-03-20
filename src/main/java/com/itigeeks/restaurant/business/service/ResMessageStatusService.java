package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResMessageStatus;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResMessageStatusService {


	public void delete(ResMessageStatus resMessageStatus) ;
	
	public ResMessageStatus saveOrUpdate(ResMessageStatus resMessageStatus) ;

	public ResMessageStatus load(Long id ) ;

	
	public List<ResMessageStatus> loadAll() ;


	public List<ResMessageStatus> loadByNamedQuery(String queryName) ;

	
	public List<ResMessageStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResMessageStatus> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}