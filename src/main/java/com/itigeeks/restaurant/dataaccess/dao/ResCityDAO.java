package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCity;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResCityDAO {


	public void delete(ResCity resCity) ;
	
	public ResCity saveOrUpdate(ResCity resCity) ;

	public ResCity load(Long id ) ;

	
	public List<ResCity> loadAll() ;


	public List<ResCity> loadByNamedQuery(String queryName) ;

	
	public List<ResCity> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResCity> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResCity> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResCity> loadAll(Integer startPage , Integer pageSize ) ;

}
