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
	
	
	public List<ResMessageStatus> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResMessageStatus> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResMessageStatus> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResMessageStatus> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResMessageStatus> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResMessageStatus> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResMessageStatus> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResMessageStatus> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResMessageStatus> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}