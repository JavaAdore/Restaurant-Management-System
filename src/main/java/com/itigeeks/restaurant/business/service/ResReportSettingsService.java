package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResReportSettings;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResReportSettingsService {


	public void delete(ResReportSettings resReportSettings) ;
	
	public ResReportSettings saveOrUpdate(ResReportSettings resReportSettings) ;

	public ResReportSettings load(Long id ) ;

	
	public List<ResReportSettings> loadAll() ;


	public List<ResReportSettings> loadByNamedQuery(String queryName) ;

	
	public List<ResReportSettings> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResReportSettings> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResReportSettings> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResReportSettings> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResReportSettings> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResReportSettings> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResReportSettings> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResReportSettings> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResReportSettings> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResReportSettings> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}