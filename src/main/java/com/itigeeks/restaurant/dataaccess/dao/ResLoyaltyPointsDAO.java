package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResLoyaltyPoints;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResLoyaltyPointsDAO {


	public void delete(ResLoyaltyPoints resLoyaltyPoints) ;
	
	public ResLoyaltyPoints saveOrUpdate(ResLoyaltyPoints resLoyaltyPoints) ;

	public ResLoyaltyPoints load(Long id ) ;

	
	public List<ResLoyaltyPoints> loadAll() ;


	public List<ResLoyaltyPoints> loadByNamedQuery(String queryName) ;

	
	public List<ResLoyaltyPoints> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResLoyaltyPoints> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
