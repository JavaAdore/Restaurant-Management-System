package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDiscountProduct;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResDiscountProductDAO {


	public void delete(ResDiscountProduct resDiscountProduct) ;
	
	public ResDiscountProduct saveOrUpdate(ResDiscountProduct resDiscountProduct) ;

	public ResDiscountProduct load(Long id ) ;

	
	public List<ResDiscountProduct> loadAll() ;


	public List<ResDiscountProduct> loadByNamedQuery(String queryName) ;

	
	public List<ResDiscountProduct> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResDiscountProduct> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
