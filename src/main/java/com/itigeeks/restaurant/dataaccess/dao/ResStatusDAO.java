package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResStatus;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResStatusDAO {


	public void delete(ResStatus resStatus) ;
	
	public ResStatus saveOrUpdate(ResStatus resStatus) ;

	public ResStatus load(Long id ) ;

	
	public List<ResStatus> loadAll() ;


	public List<ResStatus> loadByNamedQuery(String queryName) ;

	
	public List<ResStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResStatus> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
