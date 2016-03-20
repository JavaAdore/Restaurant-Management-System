package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResOrderProductAddon;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResOrderProductAddonService {


	public void delete(ResOrderProductAddon resOrderProductAddon) ;
	
	public ResOrderProductAddon saveOrUpdate(ResOrderProductAddon resOrderProductAddon) ;

	public ResOrderProductAddon load(Long id ) ;

	
	public List<ResOrderProductAddon> loadAll() ;


	public List<ResOrderProductAddon> loadByNamedQuery(String queryName) ;

	
	public List<ResOrderProductAddon> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResOrderProductAddon> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}