package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResProductPurchaseHistory;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResProductPurchaseHistoryService {


	public void delete(ResProductPurchaseHistory resProductPurchaseHistory) ;
	
	public ResProductPurchaseHistory saveOrUpdate(ResProductPurchaseHistory resProductPurchaseHistory) ;

	public ResProductPurchaseHistory load(Long id ) ;

	
	public List<ResProductPurchaseHistory> loadAll() ;


	public List<ResProductPurchaseHistory> loadByNamedQuery(String queryName) ;

	
	public List<ResProductPurchaseHistory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResProductPurchaseHistory> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResProductPurchaseHistory> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResProductPurchaseHistory> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResProductPurchaseHistory> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResProductPurchaseHistory> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResProductPurchaseHistory> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResProductPurchaseHistory> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResProductPurchaseHistory> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResProductPurchaseHistory> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}