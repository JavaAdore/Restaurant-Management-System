package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReservation;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResReservationDAO {


	public void delete(ResReservation resReservation) ;
	
	public ResReservation saveOrUpdate(ResReservation resReservation) ;

	public ResReservation load(Long id ) ;

	
	public List<ResReservation> loadAll() ;


	public List<ResReservation> loadByNamedQuery(String queryName) ;

	
	public List<ResReservation> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResReservation> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
