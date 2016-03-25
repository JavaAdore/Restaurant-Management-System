package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResPrepLocation;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResPrepLocationService {


	public void delete(ResPrepLocation resPrepLocation) ;
	
	public ResPrepLocation saveOrUpdate(ResPrepLocation resPrepLocation) ;

	public ResPrepLocation load(Long id ) ;

	
	public List<ResPrepLocation> loadAll() ;


	public List<ResPrepLocation> loadByNamedQuery(String queryName) ;

	
	public List<ResPrepLocation> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResPrepLocation> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResPrepLocation> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResPrepLocation> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResPrepLocation> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResPrepLocation> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResPrepLocation> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResPrepLocation> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResPrepLocation> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResPrepLocation> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}