package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResCardType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResCardTypeService {


	public void delete(ResCardType resCardType) ;
	
	public ResCardType saveOrUpdate(ResCardType resCardType) ;

	public ResCardType load(Long id ) ;

	
	public List<ResCardType> loadAll() ;


	public List<ResCardType> loadByNamedQuery(String queryName) ;

	
	public List<ResCardType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResCardType> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResCardType> search( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResCardType> loadAll(Integer startPage , Integer pageSize ) ;

}