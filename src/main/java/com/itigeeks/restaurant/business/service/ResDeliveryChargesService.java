package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResDeliveryCharges;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResDeliveryChargesService {


	public void delete(ResDeliveryCharges resDeliveryCharges) ;
	
	public ResDeliveryCharges saveOrUpdate(ResDeliveryCharges resDeliveryCharges) ;

	public ResDeliveryCharges load(Long id ) ;

	
	public List<ResDeliveryCharges> loadAll() ;


	public List<ResDeliveryCharges> loadByNamedQuery(String queryName) ;

	
	public List<ResDeliveryCharges> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResDeliveryCharges> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResDeliveryCharges> search( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResDeliveryCharges> loadAll(Integer startPage , Integer pageSize ) ;

}