package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResReports;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResReportsService {


	public void delete(ResReports resReports) ;
	
	public ResReports saveOrUpdate(ResReports resReports) ;

	public ResReports load(Long id ) ;

	
	public List<ResReports> loadAll() ;


	public List<ResReports> loadByNamedQuery(String queryName) ;

	
	public List<ResReports> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResReports> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResReports> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResReports> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResReports> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResReports> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResReports> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResReports> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResReports> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResReports> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}