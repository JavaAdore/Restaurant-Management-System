package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResAddon;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResAddonDAO {


	public void delete(ResAddon resAddon) ;
	
	public ResAddon saveOrUpdate(ResAddon resAddon) ;

	public ResAddon load(Long id ) ;

	
	public List<ResAddon> loadAll() ;


	public List<ResAddon> loadByNamedQuery(String queryName) ;

	
	public List<ResAddon> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResAddon> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
