package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReservationInvoice;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResReservationInvoiceDAO {


	public void delete(ResReservationInvoice resReservationInvoice) ;
	
	public ResReservationInvoice saveOrUpdate(ResReservationInvoice resReservationInvoice) ;

	public ResReservationInvoice load(Long id ) ;

	
	public List<ResReservationInvoice> loadAll() ;


	public List<ResReservationInvoice> loadByNamedQuery(String queryName) ;

	
	public List<ResReservationInvoice> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResReservationInvoice> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResReservationInvoice> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResReservationInvoice> loadAll(Integer startPage , Integer pageSize ) ;

}
