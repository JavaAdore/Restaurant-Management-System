package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResOrderActionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResOrderActionTypeService {


	public void delete(ResOrderActionType resOrderActionType) ;
	
	public ResOrderActionType saveOrUpdate(ResOrderActionType resOrderActionType) ;

	public ResOrderActionType load(Long id ) ;

	
	public List<ResOrderActionType> loadAll() ;


	public List<ResOrderActionType> loadByNamedQuery(String queryName) ;

	
	public List<ResOrderActionType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResOrderActionType> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}