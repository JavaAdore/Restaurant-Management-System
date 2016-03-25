package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResTableTransactions;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResTableTransactionsService {


	public void delete(ResTableTransactions resTableTransactions) ;
	
	public ResTableTransactions saveOrUpdate(ResTableTransactions resTableTransactions) ;

	public ResTableTransactions load(Long id ) ;

	
	public List<ResTableTransactions> loadAll() ;


	public List<ResTableTransactions> loadByNamedQuery(String queryName) ;

	
	public List<ResTableTransactions> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResTableTransactions> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResTableTransactions> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResTableTransactions> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResTableTransactions> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResTableTransactions> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResTableTransactions> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResTableTransactions> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResTableTransactions> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResTableTransactions> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}