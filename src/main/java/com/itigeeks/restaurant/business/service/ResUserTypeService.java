package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResUserType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResUserTypeService {


	public void delete(ResUserType resUserType) ;
	
	public ResUserType saveOrUpdate(ResUserType resUserType) ;

	public ResUserType load(Long id ) ;

	
	public List<ResUserType> loadAll() ;


	public List<ResUserType> loadByNamedQuery(String queryName) ;

	
	public List<ResUserType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResUserType> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}