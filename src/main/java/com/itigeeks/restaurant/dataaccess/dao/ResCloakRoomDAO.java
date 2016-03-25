package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCloakRoom;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResCloakRoomDAO {


	public void delete(ResCloakRoom resCloakRoom) ;
	
	public ResCloakRoom saveOrUpdate(ResCloakRoom resCloakRoom) ;

	public ResCloakRoom load(Long id ) ;

	
	public List<ResCloakRoom> loadAll() ;


	public List<ResCloakRoom> loadByNamedQuery(String queryName) ;

	
	public List<ResCloakRoom> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResCloakRoom> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResCloakRoom> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResCloakRoom> loadAll(Integer startPage , Integer pageSize ) ;

}
