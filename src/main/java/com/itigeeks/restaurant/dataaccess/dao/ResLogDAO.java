package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResLog;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResLogDAO {


	public void delete(ResLog resLog) ;
	
	public ResLog saveOrUpdate(ResLog resLog) ;

	public ResLog load(Long id ) ;

	
	public List<ResLog> loadAll() ;


	public List<ResLog> loadByNamedQuery(String queryName) ;

	
	public List<ResLog> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResLog> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
