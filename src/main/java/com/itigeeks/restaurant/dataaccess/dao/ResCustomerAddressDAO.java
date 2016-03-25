package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCustomerAddress;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResCustomerAddressDAO {


	public void delete(ResCustomerAddress resCustomerAddress) ;
	
	public ResCustomerAddress saveOrUpdate(ResCustomerAddress resCustomerAddress) ;

	public ResCustomerAddress load(Long id ) ;

	
	public List<ResCustomerAddress> loadAll() ;


	public List<ResCustomerAddress> loadByNamedQuery(String queryName) ;

	
	public List<ResCustomerAddress> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResCustomerAddress> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResCustomerAddress> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResCustomerAddress> loadAll(Integer startPage , Integer pageSize ) ;

}
