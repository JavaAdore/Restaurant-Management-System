package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResPromotionProduct;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResPromotionProductService {


	public void delete(ResPromotionProduct resPromotionProduct) ;
	
	public ResPromotionProduct saveOrUpdate(ResPromotionProduct resPromotionProduct) ;

	public ResPromotionProduct load(Long id ) ;

	
	public List<ResPromotionProduct> loadAll() ;


	public List<ResPromotionProduct> loadByNamedQuery(String queryName) ;

	
	public List<ResPromotionProduct> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResPromotionProduct> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResPromotionProduct> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResPromotionProduct> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResPromotionProduct> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResPromotionProduct> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResPromotionProduct> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResPromotionProduct> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResPromotionProduct> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResPromotionProduct> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}