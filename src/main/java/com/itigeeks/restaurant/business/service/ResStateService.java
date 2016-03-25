package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResState;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResStateService {


	public void delete(ResState resState) ;
	
	public ResState saveOrUpdate(ResState resState) ;

	public ResState load(Long id ) ;

	
	public List<ResState> loadAll() ;


	public List<ResState> loadByNamedQuery(String queryName) ;

	
	public List<ResState> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResState> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResState> search( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResState> loadAll(Integer startPage , Integer pageSize ) ;

}