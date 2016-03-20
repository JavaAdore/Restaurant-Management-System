package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCustomerAddress;
import com.itigeeks.restaurant.dataaccess.dao.ResCustomerAddressDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResCustomerAddressDAOImpl extends AbstractDAO implements ResCustomerAddressDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResCustomerAddress resCustomerAddress) 
	{
		super.delete(resCustomerAddress);
	}
	
	public ResCustomerAddress saveOrUpdate(ResCustomerAddress resCustomerAddress) 
	{
		return (ResCustomerAddress) super.saveOrUpdate(resCustomerAddress);
	}

	public ResCustomerAddress load(Long id )
	{
		return (ResCustomerAddress) super.get(ResCustomerAddress.class , id);
	}

	
	public List<ResCustomerAddress> loadAll()
	{
		return (List<ResCustomerAddress>) super.loadAll(ResCustomerAddress.class);
	}


	public List<ResCustomerAddress> loadByNamedQuery(String queryName)
	{
		
		return (List<ResCustomerAddress>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResCustomerAddress> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResCustomerAddress>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResCustomerAddress> search( Map<String, Object> criteria )
	{
		return super.search( ResCustomerAddress.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResCustomerAddress.class);
	}
}
