package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResZreportLog;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResZreportLogDAO {


	public void delete(ResZreportLog resZreportLog) ;
	
	public ResZreportLog saveOrUpdate(ResZreportLog resZreportLog) ;

	public ResZreportLog load(Long id ) ;

	
	public List<ResZreportLog> loadAll() ;


	public List<ResZreportLog> loadByNamedQuery(String queryName) ;

	
	public List<ResZreportLog> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResZreportLog> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResZreportLog> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResZreportLog> loadAll(Integer startPage , Integer pageSize ) ;

}
