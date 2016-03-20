package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrder;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResOrderDAO {


	public void delete(ResOrder resOrder) ;
	
	public ResOrder saveOrUpdate(ResOrder resOrder) ;

	public ResOrder load(Long id ) ;

	
	public List<ResOrder> loadAll() ;


	public List<ResOrder> loadByNamedQuery(String queryName) ;

	
	public List<ResOrder> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResOrder> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
