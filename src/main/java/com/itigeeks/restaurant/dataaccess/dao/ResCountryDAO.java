package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCountry;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResCountryDAO {


	public void delete(ResCountry resCountry) ;
	
	public ResCountry saveOrUpdate(ResCountry resCountry) ;

	public ResCountry load(Long id ) ;

	
	public List<ResCountry> loadAll() ;


	public List<ResCountry> loadByNamedQuery(String queryName) ;

	
	public List<ResCountry> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResCountry> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResCountry> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResCountry> loadAll(Integer startPage , Integer pageSize ) ;

}
