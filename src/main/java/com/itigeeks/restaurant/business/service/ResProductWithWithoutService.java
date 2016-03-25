package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResProductWithWithout;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResProductWithWithoutService {


	public void delete(ResProductWithWithout resProductWithWithout) ;
	
	public ResProductWithWithout saveOrUpdate(ResProductWithWithout resProductWithWithout) ;

	public ResProductWithWithout load(Long id ) ;

	
	public List<ResProductWithWithout> loadAll() ;


	public List<ResProductWithWithout> loadByNamedQuery(String queryName) ;

	
	public List<ResProductWithWithout> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResProductWithWithout> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResProductWithWithout> search( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResProductWithWithout> loadAll(Integer startPage , Integer pageSize ) ;

}