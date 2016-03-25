package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResInvoice;
import com.itigeeks.restaurant.dataaccess.dao.ResInvoiceDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResInvoiceDAOImpl extends AbstractDAO implements ResInvoiceDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResInvoice resInvoice) 
	{
		super.delete(resInvoice);
	}
	
	public ResInvoice saveOrUpdate(ResInvoice resInvoice) 
	{
		return (ResInvoice) super.saveOrUpdate(resInvoice);
	}

	public ResInvoice load(Long id )
	{
		return (ResInvoice) super.get(ResInvoice.class , id);
	}

	
	public List<ResInvoice> loadAll()
	{
		return (List<ResInvoice>) super.loadAll(ResInvoice.class);
	}


	public List<ResInvoice> loadByNamedQuery(String queryName)
	{
		
		return (List<ResInvoice>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResInvoice> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResInvoice>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResInvoice> search( Map<String, Object> criteria )
	{
		return super.search( ResInvoice.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResInvoice.class);
	}

	public List<ResInvoice> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResInvoice.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResInvoice> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResInvoice.class , startPage , pageSize);
	}

}
