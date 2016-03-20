package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResOrderTypeDAO {


	public void delete(ResOrderType resOrderType) ;
	
	public ResOrderType saveOrUpdate(ResOrderType resOrderType) ;

	public ResOrderType load(Long id ) ;

	
	public List<ResOrderType> loadAll() ;


	public List<ResOrderType> loadByNamedQuery(String queryName) ;

	
	public List<ResOrderType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResOrderType> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
