package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProduct;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

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
	
	public List<ResProduct> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResProduct> loadByNamedQuery(String queryName) ;
	
	public List<ResProduct> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResProduct> load( Map<String, Object> criteria ) ;
	
	public List<ResProduct> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResProduct> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResProduct> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResProduct> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
