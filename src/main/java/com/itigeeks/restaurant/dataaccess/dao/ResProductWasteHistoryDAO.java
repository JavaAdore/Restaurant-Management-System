package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProductWasteHistory;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResProductWasteHistoryDAO {


	public void delete(ResProductWasteHistory resProductWasteHistory) ;
	
	public ResProductWasteHistory saveOrUpdate(ResProductWasteHistory resProductWasteHistory) ;

	public ResProductWasteHistory load(Long id ) ;

	
	public List<ResProductWasteHistory> loadAll() ;


	public List<ResProductWasteHistory> loadByNamedQuery(String queryName) ;

	
	public List<ResProductWasteHistory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResProductWasteHistory> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResProductWasteHistory> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResProductWasteHistory> loadAll(Integer startPage , Integer pageSize ) ;

}
