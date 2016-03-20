package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPaymentMethod;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResPaymentMethodDAO {


	public void delete(ResPaymentMethod resPaymentMethod) ;
	
	public ResPaymentMethod saveOrUpdate(ResPaymentMethod resPaymentMethod) ;

	public ResPaymentMethod load(Long id ) ;

	
	public List<ResPaymentMethod> loadAll() ;


	public List<ResPaymentMethod> loadByNamedQuery(String queryName) ;

	
	public List<ResPaymentMethod> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResPaymentMethod> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
