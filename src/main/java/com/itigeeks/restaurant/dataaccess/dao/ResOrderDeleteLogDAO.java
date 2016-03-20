package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderDeleteLog;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResOrderDeleteLogDAO {


	public void delete(ResOrderDeleteLog resOrderDeleteLog) ;
	
	public ResOrderDeleteLog saveOrUpdate(ResOrderDeleteLog resOrderDeleteLog) ;

	public ResOrderDeleteLog load(Long id ) ;

	
	public List<ResOrderDeleteLog> loadAll() ;


	public List<ResOrderDeleteLog> loadByNamedQuery(String queryName) ;

	
	public List<ResOrderDeleteLog> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResOrderDeleteLog> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
