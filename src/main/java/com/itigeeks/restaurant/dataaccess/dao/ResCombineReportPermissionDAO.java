package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCombineReportPermission;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResCombineReportPermissionDAO {


	public void delete(ResCombineReportPermission resCombineReportPermission) ;
	
	public ResCombineReportPermission saveOrUpdate(ResCombineReportPermission resCombineReportPermission) ;

	public ResCombineReportPermission load(Long id ) ;

	
	public List<ResCombineReportPermission> loadAll() ;


	public List<ResCombineReportPermission> loadByNamedQuery(String queryName) ;

	
	public List<ResCombineReportPermission> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResCombineReportPermission> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
