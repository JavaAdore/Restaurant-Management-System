package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProductMisc;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResProductMiscDAO {


	public void delete(ResProductMisc resProductMisc) ;
	
	public ResProductMisc saveOrUpdate(ResProductMisc resProductMisc) ;

	public ResProductMisc load(Long id ) ;

	
	public List<ResProductMisc> loadAll() ;


	public List<ResProductMisc> loadByNamedQuery(String queryName) ;

	
	public List<ResProductMisc> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResProductMisc> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResProductMisc> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResProductMisc> loadAll(Integer startPage , Integer pageSize ) ;

}
