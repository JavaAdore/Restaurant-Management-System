package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResReservationConfirmation;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResReservationConfirmationService {


	public void delete(ResReservationConfirmation resReservationConfirmation) ;
	
	public ResReservationConfirmation saveOrUpdate(ResReservationConfirmation resReservationConfirmation) ;

	public ResReservationConfirmation load(Long id ) ;

	
	public List<ResReservationConfirmation> loadAll() ;


	public List<ResReservationConfirmation> loadByNamedQuery(String queryName) ;

	
	public List<ResReservationConfirmation> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResReservationConfirmation> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}