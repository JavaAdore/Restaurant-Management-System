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
	
	
	public List<ResReservationTime> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResReservationTime> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResReservationTime> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResReservationTime> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResReservationTime> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResReservationTime> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResReservationTime> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResReservationTime> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResReservationTime> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}