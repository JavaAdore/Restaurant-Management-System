package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResCustomer;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResCustomerService {


	public void delete(ResCustomer resCustomer) ;
	
	public ResCustomer saveOrUpdate(ResCustomer resCustomer) ;

	public ResCustomer load(Long id ) ;

	
	public List<ResCustomer> loadAll() ;


	public List<ResCustomer> loadByNamedQuery(String queryName) ;

	
	public List<ResCustomer> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResCustomer> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}