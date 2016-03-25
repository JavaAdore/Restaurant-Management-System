package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCloakRoomStatus;

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


	public List<ResCloakRoomStatus> loadByNamedQuery(String queryName) ;

	
	public List<ResCloakRoomStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResCloakRoomStatus> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResCloakRoomStatus> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResCloakRoomStatus> loadAll(Integer startPage , Integer pageSize ) ;

}
