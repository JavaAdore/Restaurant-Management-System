package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPromotionProductDiscount;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResPromotionProductDiscountDAO {


	public void delete(ResPromotionProductDiscount resPromotionProductDiscount) ;
	
	public ResPromotionProductDiscount saveOrUpdate(ResPromotionProductDiscount resPromotionProductDiscount) ;

	public ResPromotionProductDiscount load(Long id ) ;

	
	public List<ResPromotionProductDiscount> loadAll() ;


	public List<ResPromotionProductDiscount> loadByNamedQuery(String queryName) ;

	
	public List<ResPromotionProductDiscount> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResPromotionProductDiscount> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
