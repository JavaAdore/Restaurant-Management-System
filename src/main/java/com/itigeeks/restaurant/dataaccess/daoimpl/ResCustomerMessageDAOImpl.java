package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCustomerMessage;
import com.itigeeks.restaurant.dataaccess.dao.ResCustomerMessageDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResCustomerMessageDAOImpl extends AbstractDAO implements ResCustomerMessageDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResCustomerMessage resCustomerMessage) 
	{
		super.delete(resCustomerMessage);
	}
	
	public ResCustomerMessage saveOrUpdate(ResCustomerMessage resCustomerMessage) 
	{
		return (ResCustomerMessage) super.saveOrUpdate(resCustomerMessage);
	}

	public ResCustomerMessage load(Long id )
	{
		return (ResCustomerMessage) super.get(ResCustomerMessage.class , id);
	}

	
	public List<ResCustomerMessage> loadAll()
	{
		return (List<ResCustomerMessage>) super.loadAll(ResCustomerMessage.class);
	}


	public List<ResCustomerMessage> loadByNamedQuery(String queryName)
	{
		
		return (List<ResCustomerMessage>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResCustomerMessage> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResCustomerMessage>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResCustomerMessage> search( Map<String, Object> criteria )
	{
		return super.search( ResCustomerMessage.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResCustomerMessage.class);
	}

	public List<ResCustomerMessage> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResCustomerMessage.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResCustomerMessage> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResCustomerMessage.class , startPage , pageSize);
	}

}
