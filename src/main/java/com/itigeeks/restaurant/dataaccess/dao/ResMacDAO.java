package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResMac;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResMacDAO {


	public void delete(ResMac resMac) ;
	
	public ResMac saveOrUpdate(ResMac resMac) ;

	public ResMac load(Long id ) ;

	
	public List<ResMac> loadAll() ;


	public List<ResMac> loadByNamedQuery(String queryName) ;

	
	public List<ResMac> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResMac> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
