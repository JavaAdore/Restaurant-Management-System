package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResModem;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResModemService {


	public void delete(ResModem resModem) ;
	
	public ResModem saveOrUpdate(ResModem resModem) ;

	public ResModem load(Long id ) ;

	
	public List<ResModem> loadAll() ;


	public List<ResModem> loadByNamedQuery(String queryName) ;

	
	public List<ResModem> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResModem> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResModem> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResModem> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResModem> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResModem> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResModem> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResModem> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResModem> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResModem> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}