package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPrinter;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResPrinterDAO {


	public void delete(ResPrinter resPrinter) ;
	
	public ResPrinter saveOrUpdate(ResPrinter resPrinter) ;

	public ResPrinter load(Long id ) ;

	public List<ResPrinter> loadAll() ;
	
	public List<ResPrinter> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResPrinter> loadByNamedQuery(String queryName) ;
	
	public List<ResPrinter> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResPrinter> load( Map<String, Object> criteria ) ;
	
	public List<ResPrinter> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResPrinter> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResPrinter> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResPrinter> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
