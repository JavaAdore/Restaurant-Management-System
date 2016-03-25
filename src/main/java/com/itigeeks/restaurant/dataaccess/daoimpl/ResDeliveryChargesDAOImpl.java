package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDeliveryCharges;
import com.itigeeks.restaurant.dataaccess.dao.ResDeliveryChargesDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResDeliveryChargesDAOImpl extends AbstractDAO implements ResDeliveryChargesDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResDeliveryCharges resDeliveryCharges) 
	{
		super.delete(resDeliveryCharges);
	}
	
	public ResDeliveryCharges saveOrUpdate(ResDeliveryCharges resDeliveryCharges) 
	{
		return (ResDeliveryCharges) super.saveOrUpdate(resDeliveryCharges);
	}

	public ResDeliveryCharges load(Long id )
	{
		return (ResDeliveryCharges) super.get(ResDeliveryCharges.class , id);
	}

	
	public List<ResDeliveryCharges> loadAll()
	{
		return (List<ResDeliveryCharges>) super.loadAll(ResDeliveryCharges.class);
	}


	public List<ResDeliveryCharges> loadByNamedQuery(String queryName)
	{
		
		return (List<ResDeliveryCharges>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResDeliveryCharges> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResDeliveryCharges>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResDeliveryCharges> search( Map<String, Object> criteria )
	{
		return super.search( ResDeliveryCharges.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResDeliveryCharges.class);
	}

	public List<ResDeliveryCharges> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResDeliveryCharges.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResDeliveryCharges> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResDeliveryCharges.class , startPage , pageSize);
	}

}
