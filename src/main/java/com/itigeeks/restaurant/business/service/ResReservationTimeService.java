package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResReservationTime;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResReservationTimeService {


	public void delete(ResReservationTime resReservationTime) ;
	
	public ResReservationTime saveOrUpdate(ResReservationTime resReservationTime) ;

	public ResReservationTime load(Long id ) ;

	
	public List<ResReservationTime> loadAll() ;


	public List<ResReservationTime> loadByNamedQuery(String queryName) ;

	
	public List<ResReservationTime> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResReservationTime> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}