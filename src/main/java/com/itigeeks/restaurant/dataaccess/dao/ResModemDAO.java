package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResModem;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResModemDAO {


	public void delete(ResModem resModem) ;
	
	public ResModem saveOrUpdate(ResModem resModem) ;

	public ResModem load(Long id ) ;

	
	public List<ResModem> loadAll() ;


	public List<ResModem> loadByNamedQuery(String queryName) ;

	
	public List<ResModem> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResModem> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
