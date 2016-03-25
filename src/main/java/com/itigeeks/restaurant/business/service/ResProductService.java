package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResProduct;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResProductService {


	public void delete(ResProduct resProduct) ;
	
	public ResProduct saveOrUpdate(ResProduct resProduct) ;

	public ResProduct load(Long id ) ;

	
	public List<ResProduct> loadAll() ;


	public List<ResProduct> loadByNamedQuery(String queryName) ;

	
	public List<ResProduct> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResProduct> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResProduct> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResProduct> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResProduct> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResProduct> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResProduct> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResProduct> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResProduct> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResProduct> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}