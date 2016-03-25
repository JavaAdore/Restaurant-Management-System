package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCombineReportPermission;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

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
	
	public List<ResCombineReportPermission> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResCombineReportPermission> loadByNamedQuery(String queryName) ;
	
	public List<ResCombineReportPermission> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResCombineReportPermission> load( Map<String, Object> criteria ) ;
	
	public List<ResCombineReportPermission> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResCombineReportPermission> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResCombineReportPermission> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResCombineReportPermission> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
