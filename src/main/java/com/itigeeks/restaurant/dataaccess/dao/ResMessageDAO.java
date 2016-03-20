package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResMessage;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResMessageDAO {


	public void delete(ResMessage resMessage) ;
	
	public ResMessage saveOrUpdate(ResMessage resMessage) ;

	public ResMessage load(Long id ) ;

	
	public List<ResMessage> loadAll() ;


	public List<ResMessage> loadByNamedQuery(String queryName) ;

	
	public List<ResMessage> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResMessage> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
