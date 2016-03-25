package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResUser;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResUserDAO {


	public void delete(ResUser resUser) ;
	
	public ResUser saveOrUpdate(ResUser resUser) ;

	public ResUser load(Long id ) ;

	
	public List<ResUser> loadAll() ;


	public List<ResUser> loadByNamedQuery(String queryName) ;

	
	public List<ResUser> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResUser> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResUser> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResUser> loadAll(Integer startPage , Integer pageSize ) ;

}
