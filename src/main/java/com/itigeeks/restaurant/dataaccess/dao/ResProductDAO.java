package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProduct;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResProductDAO {


	public void delete(ResProduct resProduct) ;
	
	public ResProduct saveOrUpdate(ResProduct resProduct) ;

	public ResProduct load(Long id ) ;

	
	public List<ResProduct> loadAll() ;


	public List<ResProduct> loadByNamedQuery(String queryName) ;

	
	public List<ResProduct> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResProduct> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResProduct> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResProduct> loadAll(Integer startPage , Integer pageSize ) ;

}
