package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDeliverCharges;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResDeliverChargesDAO {


	public void delete(ResDeliverCharges resDeliverCharges) ;
	
	public ResDeliverCharges saveOrUpdate(ResDeliverCharges resDeliverCharges) ;

	public ResDeliverCharges load(Long id ) ;

	public List<ResDeliverCharges> loadAll() ;
	
	public List<ResDeliverCharges> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResDeliverCharges> loadByNamedQuery(String queryName) ;
	
	public List<ResDeliverCharges> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResDeliverCharges> load( Map<String, Object> criteria ) ;
	
	public List<ResDeliverCharges> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResDeliverCharges> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResDeliverCharges> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResDeliverCharges> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
