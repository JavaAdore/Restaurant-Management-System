package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProductWithWithout;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResProductWithWithoutDAO {


	public void delete(ResProductWithWithout resProductWithWithout) ;
	
	public ResProductWithWithout saveOrUpdate(ResProductWithWithout resProductWithWithout) ;

	public ResProductWithWithout load(Long id ) ;

	
	public List<ResProductWithWithout> loadAll() ;


	public List<ResProductWithWithout> loadByNamedQuery(String queryName) ;

	
	public List<ResProductWithWithout> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResProductWithWithout> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
