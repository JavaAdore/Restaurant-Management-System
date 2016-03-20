package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReservationInvoice;
import com.itigeeks.restaurant.dataaccess.dao.ResReservationInvoiceDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResReservationInvoiceDAOImpl extends AbstractDAO implements ResReservationInvoiceDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResReservationInvoice resReservationInvoice) 
	{
		super.delete(resReservationInvoice);
	}
	
	public ResReservationInvoice saveOrUpdate(ResReservationInvoice resReservationInvoice) 
	{
		return (ResReservationInvoice) super.saveOrUpdate(resReservationInvoice);
	}

	public ResReservationInvoice load(Long id )
	{
		return (ResReservationInvoice) super.get(ResReservationInvoice.class , id);
	}

	
	public List<ResReservationInvoice> loadAll()
	{
		return (List<ResReservationInvoice>) super.loadAll(ResReservationInvoice.class);
	}


	public List<ResReservationInvoice> loadByNamedQuery(String queryName)
	{
		
		return (List<ResReservationInvoice>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResReservationInvoice> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResReservationInvoice>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResReservationInvoice> search( Map<String, Object> criteria )
	{
		return super.search( ResReservationInvoice.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResReservationInvoice.class);
	}
}
