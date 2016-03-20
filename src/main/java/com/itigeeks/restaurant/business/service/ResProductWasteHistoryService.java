package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResProductWasteHistory;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResProductWasteHistoryService {


	public void delete(ResProductWasteHistory resProductWasteHistory) ;
	
	public ResProductWasteHistory saveOrUpdate(ResProductWasteHistory resProductWasteHistory) ;

	public ResProductWasteHistory load(Long id ) ;

	
	public List<ResProductWasteHistory> loadAll() ;


	public List<ResProductWasteHistory> loadByNamedQuery(String queryName) ;

	
	public List<ResProductWasteHistory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResProductWasteHistory> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}