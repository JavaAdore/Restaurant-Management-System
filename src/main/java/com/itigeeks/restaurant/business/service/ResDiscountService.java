package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResDiscount;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResDiscountService {


	public void delete(ResDiscount resDiscount) ;
	
	public ResDiscount saveOrUpdate(ResDiscount resDiscount) ;

	public ResDiscount load(Long id ) ;

	
	public List<ResDiscount> loadAll() ;


	public List<ResDiscount> loadByNamedQuery(String queryName) ;

	
	public List<ResDiscount> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResDiscount> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResDiscount> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResDiscount> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResDiscount> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResDiscount> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResDiscount> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResDiscount> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResDiscount> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResDiscount> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}