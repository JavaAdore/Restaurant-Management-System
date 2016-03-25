package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResPayment;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResPaymentService {


	public void delete(ResPayment resPayment) ;
	
	public ResPayment saveOrUpdate(ResPayment resPayment) ;

	public ResPayment load(Long id ) ;

	
	public List<ResPayment> loadAll() ;


	public List<ResPayment> loadByNamedQuery(String queryName) ;

	
	public List<ResPayment> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResPayment> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResPayment> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResPayment> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResPayment> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResPayment> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResPayment> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResPayment> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResPayment> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResPayment> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}