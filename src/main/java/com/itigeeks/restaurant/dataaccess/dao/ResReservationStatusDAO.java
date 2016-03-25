package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReservationStatus;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResReservationStatusDAO {


	public void delete(ResReservationStatus resReservationStatus) ;
	
	public ResReservationStatus saveOrUpdate(ResReservationStatus resReservationStatus) ;

	public ResReservationStatus load(Long id ) ;

	
	public List<ResReservationStatus> loadAll() ;


	public List<ResReservationStatus> loadByNamedQuery(String queryName) ;

	
	public List<ResReservationStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResReservationStatus> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResReservationStatus> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResReservationStatus> loadAll(Integer startPage , Integer pageSize ) ;

}
