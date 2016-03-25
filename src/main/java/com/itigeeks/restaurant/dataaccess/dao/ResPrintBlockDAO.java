package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPrintBlock;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResPrintBlockDAO {


	public void delete(ResPrintBlock resPrintBlock) ;
	
	public ResPrintBlock saveOrUpdate(ResPrintBlock resPrintBlock) ;

	public ResPrintBlock load(Long id ) ;

	public List<ResPrintBlock> loadAll() ;
	
	public List<ResPrintBlock> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResPrintBlock> loadByNamedQuery(String queryName) ;
	
	public List<ResPrintBlock> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResPrintBlock> load( Map<String, Object> criteria ) ;
	
	public List<ResPrintBlock> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResPrintBlock> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResPrintBlock> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResPrintBlock> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
