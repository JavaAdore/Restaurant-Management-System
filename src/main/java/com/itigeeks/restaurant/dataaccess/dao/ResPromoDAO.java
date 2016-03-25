package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPromo;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResPromoDAO {


	public void delete(ResPromo resPromo) ;
	
	public ResPromo saveOrUpdate(ResPromo resPromo) ;

	public ResPromo load(Long id ) ;

	public List<ResPromo> loadAll() ;
	
	public List<ResPromo> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResPromo> loadByNamedQuery(String queryName) ;
	
	public List<ResPromo> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResPromo> load( Map<String, Object> criteria ) ;
	
	public List<ResPromo> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResPromo> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResPromo> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResPromo> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
