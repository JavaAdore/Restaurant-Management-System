package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCustomerComment;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResCustomerCommentDAO {


	public void delete(ResCustomerComment resCustomerComment) ;
	
	public ResCustomerComment saveOrUpdate(ResCustomerComment resCustomerComment) ;

	public ResCustomerComment load(Long id ) ;

	public List<ResCustomerComment> loadAll() ;
	
	public List<ResCustomerComment> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResCustomerComment> loadByNamedQuery(String queryName) ;
	
	public List<ResCustomerComment> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResCustomerComment> load( Map<String, Object> criteria ) ;
	
	public List<ResCustomerComment> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResCustomerComment> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResCustomerComment> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResCustomerComment> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
