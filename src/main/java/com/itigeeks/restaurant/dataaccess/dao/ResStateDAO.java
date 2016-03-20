package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResState;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResStateDAO {


	public void delete(ResState resState) ;
	
	public ResState saveOrUpdate(ResState resState) ;

	public ResState load(Long id ) ;

	
	public List<ResState> loadAll() ;


	public List<ResState> loadByNamedQuery(String queryName) ;

	
	public List<ResState> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResState> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
