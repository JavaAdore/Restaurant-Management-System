package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderActionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResOrderActionTypeDAO {


	public void delete(ResOrderActionType resOrderActionType) ;
	
	public ResOrderActionType saveOrUpdate(ResOrderActionType resOrderActionType) ;

	public ResOrderActionType load(Long id ) ;

	
	public List<ResOrderActionType> loadAll() ;


	public List<ResOrderActionType> loadByNamedQuery(String queryName) ;

	
	public List<ResOrderActionType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResOrderActionType> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResOrderActionType> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResOrderActionType> loadAll(Integer startPage , Integer pageSize ) ;

}
