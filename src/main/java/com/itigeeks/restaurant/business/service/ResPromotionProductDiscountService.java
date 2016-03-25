package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResPromotionProductDiscount;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResPromotionProductDiscountService {


	public void delete(ResPromotionProductDiscount resPromotionProductDiscount) ;
	
	public ResPromotionProductDiscount saveOrUpdate(ResPromotionProductDiscount resPromotionProductDiscount) ;

	public ResPromotionProductDiscount load(Long id ) ;

	
	public List<ResPromotionProductDiscount> loadAll() ;


	public List<ResPromotionProductDiscount> loadByNamedQuery(String queryName) ;

	
	public List<ResPromotionProductDiscount> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResPromotionProductDiscount> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResPromotionProductDiscount> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResPromotionProductDiscount> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResPromotionProductDiscount> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResPromotionProductDiscount> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResPromotionProductDiscount> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResPromotionProductDiscount> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResPromotionProductDiscount> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResPromotionProductDiscount> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}