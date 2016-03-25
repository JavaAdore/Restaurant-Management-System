package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResButtonPermissionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResButtonPermissionTypeService {


	public void delete(ResButtonPermissionType resButtonPermissionType) ;
	
	public ResButtonPermissionType saveOrUpdate(ResButtonPermissionType resButtonPermissionType) ;

	public ResButtonPermissionType load(Long id ) ;

	
	public List<ResButtonPermissionType> loadAll() ;


	public List<ResButtonPermissionType> loadByNamedQuery(String queryName) ;

	
	public List<ResButtonPermissionType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResButtonPermissionType> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResButtonPermissionType> search( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResButtonPermissionType> loadAll(Integer startPage , Integer pageSize ) ;

}