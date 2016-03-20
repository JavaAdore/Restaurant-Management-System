package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProductAddon;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResProductAddonDAO {


	public void delete(ResProductAddon resProductAddon) ;
	
	public ResProductAddon saveOrUpdate(ResProductAddon resProductAddon) ;

	public ResProductAddon load(Long id ) ;

	
	public List<ResProductAddon> loadAll() ;


	public List<ResProductAddon> loadByNamedQuery(String queryName) ;

	
	public List<ResProductAddon> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResProductAddon> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
