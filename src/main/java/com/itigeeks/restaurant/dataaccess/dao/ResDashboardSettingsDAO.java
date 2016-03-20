package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDashboardSettings;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResDashboardSettingsDAO {


	public void delete(ResDashboardSettings resDashboardSettings) ;
	
	public ResDashboardSettings saveOrUpdate(ResDashboardSettings resDashboardSettings) ;

	public ResDashboardSettings load(Long id ) ;

	
	public List<ResDashboardSettings> loadAll() ;


	public List<ResDashboardSettings> loadByNamedQuery(String queryName) ;

	
	public List<ResDashboardSettings> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResDashboardSettings> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
