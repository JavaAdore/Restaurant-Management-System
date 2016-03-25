package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReservationConfirmation;

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


	public List<ResReservationConfirmation> loadByNamedQuery(String queryName) ;

	
	public List<ResReservationConfirmation> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResReservationConfirmation> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResReservationConfirmation> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResReservationConfirmation> loadAll(Integer startPage , Integer pageSize ) ;

}
