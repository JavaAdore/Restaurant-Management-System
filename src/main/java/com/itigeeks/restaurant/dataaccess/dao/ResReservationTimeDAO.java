package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReservationTime;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResReservationTimeDAO {


	public void delete(ResReservationTime resReservationTime) ;
	
	public ResReservationTime saveOrUpdate(ResReservationTime resReservationTime) ;

	public ResReservationTime load(Long id ) ;

	
	public List<ResReservationTime> loadAll() ;


	public List<ResReservationTime> loadByNamedQuery(String queryName) ;

	
	public List<ResReservationTime> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResReservationTime> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
