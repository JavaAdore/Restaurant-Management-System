package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDocContent;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResDocContentDAO {


	public void delete(ResDocContent resDocContent) ;
	
	public ResDocContent saveOrUpdate(ResDocContent resDocContent) ;

	public ResDocContent load(Long id ) ;

	
	public List<ResDocContent> loadAll() ;


	public List<ResDocContent> loadByNamedQuery(String queryName) ;

	
	public List<ResDocContent> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResDocContent> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
