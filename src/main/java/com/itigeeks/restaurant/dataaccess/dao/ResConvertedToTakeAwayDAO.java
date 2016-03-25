package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResConvertedToTakeAway;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResConvertedToTakeAwayDAO {


	public void delete(ResConvertedToTakeAway resConvertedToTakeAway) ;
	
	public ResConvertedToTakeAway saveOrUpdate(ResConvertedToTakeAway resConvertedToTakeAway) ;

	public ResConvertedToTakeAway load(Long id ) ;

	public List<ResConvertedToTakeAway> loadAll() ;
	
	public List<ResConvertedToTakeAway> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResConvertedToTakeAway> loadByNamedQuery(String queryName) ;
	
	public List<ResConvertedToTakeAway> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResConvertedToTakeAway> load( Map<String, Object> criteria ) ;
	
	public List<ResConvertedToTakeAway> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResConvertedToTakeAway> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResConvertedToTakeAway> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResConvertedToTakeAway> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
