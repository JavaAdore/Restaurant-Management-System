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
	
	
	public List<ResPromotionProductDiscount> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResPromotionProductDiscount> search( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResPromotionProductDiscount> loadAll(Integer startPage , Integer pageSize ) ;

}