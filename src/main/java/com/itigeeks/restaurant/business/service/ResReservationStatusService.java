package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResReservationStatus;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResReservationStatusService {


	public void delete(ResReservationStatus resReservationStatus) ;
	
	public ResReservationStatus saveOrUpdate(ResReservationStatus resReservationStatus) ;

	public ResReservationStatus load(Long id ) ;

	
	public List<ResReservationStatus> loadAll() ;


	public List<ResReservationStatus> loadByNamedQuery(String queryName) ;

	
	public List<ResReservationStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResReservationStatus> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}