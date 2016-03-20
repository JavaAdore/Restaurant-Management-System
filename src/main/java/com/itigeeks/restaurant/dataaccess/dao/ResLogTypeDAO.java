package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResLogType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResLogTypeDAO {


	public void delete(ResLogType resLogType) ;
	
	public ResLogType saveOrUpdate(ResLogType resLogType) ;

	public ResLogType load(Long id ) ;

	
	public List<ResLogType> loadAll() ;


	public List<ResLogType> loadByNamedQuery(String queryName) ;

	
	public List<ResLogType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResLogType> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
