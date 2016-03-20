package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDiscount;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResDiscountDAO {


	public void delete(ResDiscount resDiscount) ;
	
	public ResDiscount saveOrUpdate(ResDiscount resDiscount) ;

	public ResDiscount load(Long id ) ;

	
	public List<ResDiscount> loadAll() ;


	public List<ResDiscount> loadByNamedQuery(String queryName) ;

	
	public List<ResDiscount> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResDiscount> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
