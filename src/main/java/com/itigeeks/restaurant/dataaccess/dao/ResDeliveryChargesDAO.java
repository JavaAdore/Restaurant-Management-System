package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDeliveryCharges;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResDeliveryChargesDAO {


	public void delete(ResDeliveryCharges resDeliveryCharges) ;
	
	public ResDeliveryCharges saveOrUpdate(ResDeliveryCharges resDeliveryCharges) ;

	public ResDeliveryCharges load(Long id ) ;

	
	public List<ResDeliveryCharges> loadAll() ;


	public List<ResDeliveryCharges> loadByNamedQuery(String queryName) ;

	
	public List<ResDeliveryCharges> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResDeliveryCharges> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
