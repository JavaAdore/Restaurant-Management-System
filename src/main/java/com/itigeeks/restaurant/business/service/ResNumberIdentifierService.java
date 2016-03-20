package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResNumberIdentifier;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResNumberIdentifierService {


	public void delete(ResNumberIdentifier resNumberIdentifier) ;
	
	public ResNumberIdentifier saveOrUpdate(ResNumberIdentifier resNumberIdentifier) ;

	public ResNumberIdentifier load(Long id ) ;

	
	public List<ResNumberIdentifier> loadAll() ;


	public List<ResNumberIdentifier> loadByNamedQuery(String queryName) ;

	
	public List<ResNumberIdentifier> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResNumberIdentifier> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}