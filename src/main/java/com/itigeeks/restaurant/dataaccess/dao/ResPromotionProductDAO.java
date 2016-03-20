package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPromotionProduct;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResPromotionProductDAO {


	public void delete(ResPromotionProduct resPromotionProduct) ;
	
	public ResPromotionProduct saveOrUpdate(ResPromotionProduct resPromotionProduct) ;

	public ResPromotionProduct load(Long id ) ;

	
	public List<ResPromotionProduct> loadAll() ;


	public List<ResPromotionProduct> loadByNamedQuery(String queryName) ;

	
	public List<ResPromotionProduct> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResPromotionProduct> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
