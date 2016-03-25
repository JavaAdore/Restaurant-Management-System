package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCloakRoomStatus;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResCloakRoomStatusDAO {


	public void delete(ResCloakRoomStatus resCloakRoomStatus) ;
	
	public ResCloakRoomStatus saveOrUpdate(ResCloakRoomStatus resCloakRoomStatus) ;

	public ResCloakRoomStatus load(Long id ) ;

	public List<ResCloakRoomStatus> loadAll() ;
	
	public List<ResCloakRoomStatus> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResCloakRoomStatus> loadByNamedQuery(String queryName) ;
	
	public List<ResCloakRoomStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResCloakRoomStatus> load( Map<String, Object> criteria ) ;
	
	public List<ResCloakRoomStatus> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResCloakRoomStatus> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResCloakRoomStatus> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResCloakRoomStatus> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
