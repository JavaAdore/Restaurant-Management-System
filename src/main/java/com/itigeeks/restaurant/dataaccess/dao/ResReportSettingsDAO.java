package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReportSettings;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResReportSettingsDAO {


	public void delete(ResReportSettings resReportSettings) ;
	
	public ResReportSettings saveOrUpdate(ResReportSettings resReportSettings) ;

	public ResReportSettings load(Long id ) ;

	
	public List<ResReportSettings> loadAll() ;


	public List<ResReportSettings> loadByNamedQuery(String queryName) ;

	
	public List<ResReportSettings> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResReportSettings> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResReportSettings> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResReportSettings> loadAll(Integer startPage , Integer pageSize ) ;

}
