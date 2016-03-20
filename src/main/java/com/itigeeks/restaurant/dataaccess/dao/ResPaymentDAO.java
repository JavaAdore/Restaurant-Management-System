package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPayment;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResPaymentDAO {


	public void delete(ResPayment resPayment) ;
	
	public ResPayment saveOrUpdate(ResPayment resPayment) ;

	public ResPayment load(Long id ) ;

	
	public List<ResPayment> loadAll() ;


	public List<ResPayment> loadByNamedQuery(String queryName) ;

	
	public List<ResPayment> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResPayment> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
