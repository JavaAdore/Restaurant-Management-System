package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResOrderStatus;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResOrderStatusService {


	public void delete(ResOrderStatus resOrderStatus) ;
	
	public ResOrderStatus saveOrUpdate(ResOrderStatus resOrderStatus) ;

	public ResOrderStatus load(Long id ) ;

	
	public List<ResOrderStatus> loadAll() ;


	public List<ResOrderStatus> loadByNamedQuery(String queryName) ;

	
	public List<ResOrderStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResOrderStatus> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResOrderStatus> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResOrderStatus> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResOrderStatus> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResOrderStatus> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResOrderStatus> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResOrderStatus> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResOrderStatus> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResOrderStatus> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}