package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResQuantityType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResQuantityTypeDAO {


	public void delete(ResQuantityType resQuantityType) ;
	
	public ResQuantityType saveOrUpdate(ResQuantityType resQuantityType) ;

	public ResQuantityType load(Long id ) ;

	
	public List<ResQuantityType> loadAll() ;


	public List<ResQuantityType> loadByNamedQuery(String queryName) ;

	
	public List<ResQuantityType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResQuantityType> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
