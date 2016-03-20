package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResCloakRoomStatus;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResCloakRoomStatusService {


	public void delete(ResCloakRoomStatus resCloakRoomStatus) ;
	
	public ResCloakRoomStatus saveOrUpdate(ResCloakRoomStatus resCloakRoomStatus) ;

	public ResCloakRoomStatus load(Long id ) ;

	
	public List<ResCloakRoomStatus> loadAll() ;


	public List<ResCloakRoomStatus> loadByNamedQuery(String queryName) ;

	
	public List<ResCloakRoomStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResCloakRoomStatus> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}