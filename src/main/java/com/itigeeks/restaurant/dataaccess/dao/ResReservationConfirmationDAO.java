package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReservationConfirmation;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResReservationConfirmationDAO {


	public void delete(ResReservationConfirmation resReservationConfirmation) ;
	
	public ResReservationConfirmation saveOrUpdate(ResReservationConfirmation resReservationConfirmation) ;

	public ResReservationConfirmation load(Long id ) ;

	public List<ResReservationConfirmation> loadAll() ;
	
	public List<ResReservationConfirmation> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResReservationConfirmation> loadByNamedQuery(String queryName) ;
	
	public List<ResReservationConfirmation> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResReservationConfirmation> load( Map<String, Object> criteria ) ;
	
	public List<ResReservationConfirmation> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResReservationConfirmation> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResReservationConfirmation> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResReservationConfirmation> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
