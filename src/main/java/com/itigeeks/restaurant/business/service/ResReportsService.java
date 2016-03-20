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
	
	
	public List<ResReports> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}