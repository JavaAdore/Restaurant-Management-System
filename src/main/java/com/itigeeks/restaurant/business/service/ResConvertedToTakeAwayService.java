package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResConvertedToTakeAway;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResConvertedToTakeAwayService {


	public void delete(ResConvertedToTakeAway resConvertedToTakeAway) ;
	
	public ResConvertedToTakeAway saveOrUpdate(ResConvertedToTakeAway resConvertedToTakeAway) ;

	public ResConvertedToTakeAway load(Long id ) ;

	
	public List<ResConvertedToTakeAway> loadAll() ;


	public List<ResConvertedToTakeAway> loadByNamedQuery(String queryName) ;

	
	public List<ResConvertedToTakeAway> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResConvertedToTakeAway> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResConvertedToTakeAway> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResConvertedToTakeAway> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResConvertedToTakeAway> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResConvertedToTakeAway> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResConvertedToTakeAway> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResConvertedToTakeAway> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResConvertedToTakeAway> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResConvertedToTakeAway> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}