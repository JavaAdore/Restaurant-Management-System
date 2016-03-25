package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResTable;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResTableDAO {


	public void delete(ResTable resTable) ;
	
	public ResTable saveOrUpdate(ResTable resTable) ;

	public ResTable load(Long id ) ;

	
	public List<ResTable> loadAll() ;


	public List<ResTable> loadByNamedQuery(String queryName) ;

	
	public List<ResTable> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResTable> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResTable> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResTable> loadAll(Integer startPage , Integer pageSize ) ;

}
