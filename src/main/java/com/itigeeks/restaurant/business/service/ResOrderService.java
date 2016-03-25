package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResOrder;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResOrderService {


	public void delete(ResOrder resOrder) ;
	
	public ResOrder saveOrUpdate(ResOrder resOrder) ;

	public ResOrder load(Long id ) ;

	
	public List<ResOrder> loadAll() ;


	public List<ResOrder> loadByNamedQuery(String queryName) ;

	
	public List<ResOrder> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResOrder> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResOrder> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResOrder> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResOrder> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResOrder> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResOrder> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResOrder> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResOrder> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResOrder> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}