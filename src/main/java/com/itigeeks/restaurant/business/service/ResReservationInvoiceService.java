package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResReservationInvoice;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResReservationInvoiceService {


	public void delete(ResReservationInvoice resReservationInvoice) ;
	
	public ResReservationInvoice saveOrUpdate(ResReservationInvoice resReservationInvoice) ;

	public ResReservationInvoice load(Long id ) ;

	
	public List<ResReservationInvoice> loadAll() ;


	public List<ResReservationInvoice> loadByNamedQuery(String queryName) ;

	
	public List<ResReservationInvoice> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResReservationInvoice> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}