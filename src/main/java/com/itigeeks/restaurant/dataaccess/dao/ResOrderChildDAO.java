package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderChild;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResOrderChildDAO {


	public void delete(ResOrderChild resOrderChild) ;
	
	public ResOrderChild saveOrUpdate(ResOrderChild resOrderChild) ;

	public ResOrderChild load(Long id ) ;

	
	public List<ResOrderChild> loadAll() ;


	public List<ResOrderChild> loadByNamedQuery(String queryName) ;

	
	public List<ResOrderChild> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResOrderChild> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
