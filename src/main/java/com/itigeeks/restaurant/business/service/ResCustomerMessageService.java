package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResCustomerMessage;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResCustomerMessageService {


	public void delete(ResCustomerMessage resCustomerMessage) ;
	
	public ResCustomerMessage saveOrUpdate(ResCustomerMessage resCustomerMessage) ;

	public ResCustomerMessage load(Long id ) ;

	
	public List<ResCustomerMessage> loadAll() ;


	public List<ResCustomerMessage> loadByNamedQuery(String queryName) ;

	
	public List<ResCustomerMessage> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResCustomerMessage> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResCustomerMessage> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResCustomerMessage> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResCustomerMessage> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResCustomerMessage> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResCustomerMessage> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResCustomerMessage> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResCustomerMessage> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResCustomerMessage> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}