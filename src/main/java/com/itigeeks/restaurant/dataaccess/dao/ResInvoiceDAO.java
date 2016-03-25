package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResInvoice;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResInvoiceDAO {


	public void delete(ResInvoice resInvoice) ;
	
	public ResInvoice saveOrUpdate(ResInvoice resInvoice) ;

	public ResInvoice load(Long id ) ;

	
	public List<ResInvoice> loadAll() ;


	public List<ResInvoice> loadByNamedQuery(String queryName) ;

	
	public List<ResInvoice> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResInvoice> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResInvoice> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResInvoice> loadAll(Integer startPage , Integer pageSize ) ;

}
