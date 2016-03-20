package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCustomerMessage;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResCustomerMessageDAO {


	public void delete(ResCustomerMessage resCustomerMessage) ;
	
	public ResCustomerMessage saveOrUpdate(ResCustomerMessage resCustomerMessage) ;

	public ResCustomerMessage load(Long id ) ;

	
	public List<ResCustomerMessage> loadAll() ;


	public List<ResCustomerMessage> loadByNamedQuery(String queryName) ;

	
	public List<ResCustomerMessage> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResCustomerMessage> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
