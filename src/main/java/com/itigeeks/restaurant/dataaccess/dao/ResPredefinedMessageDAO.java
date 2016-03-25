package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPredefinedMessage;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResPredefinedMessageDAO {


	public void delete(ResPredefinedMessage resPredefinedMessage) ;
	
	public ResPredefinedMessage saveOrUpdate(ResPredefinedMessage resPredefinedMessage) ;

	public ResPredefinedMessage load(Long id ) ;

	public List<ResPredefinedMessage> loadAll() ;
	
	public List<ResPredefinedMessage> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResPredefinedMessage> loadByNamedQuery(String queryName) ;
	
	public List<ResPredefinedMessage> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResPredefinedMessage> load( Map<String, Object> criteria ) ;
	
	public List<ResPredefinedMessage> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResPredefinedMessage> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResPredefinedMessage> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResPredefinedMessage> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
