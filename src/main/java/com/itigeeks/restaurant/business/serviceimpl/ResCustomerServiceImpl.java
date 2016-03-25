/*
 * Created on 24 Mar 2016 ( Time 12:52:05 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResCustomerService;
import com.itigeeks.restaurant.common.entity.schema.ResCustomer;
import com.itigeeks.restaurant.dataaccess.dao.ResCustomerDAO;
/**
 * Implementation of ResCustomerService
 */
@Service
public class ResCustomerServiceImpl implements ResCustomerService {


	@Autowired
	private ResCustomerDAO resCustomerDAO;

	public void delete(ResCustomer resCustomer)
	{
		 resCustomerDAO.delete(resCustomer);
	}
	
	public ResCustomer saveOrUpdate(ResCustomer resCustomer)
	{
		return resCustomerDAO.saveOrUpdate( resCustomer);
	}

	public ResCustomer load(Long id )
	{
		return resCustomerDAO.load( id );
	}

	
	public List<ResCustomer> loadAll()
	{
		return resCustomerDAO.loadAll();
	}


	public List<ResCustomer> loadByNamedQuery(String queryName)
	{
		return resCustomerDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResCustomer> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resCustomerDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResCustomer> search( Map<String, Object> criteria )
	{
		return resCustomerDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resCustomerDAO.countAll();
	}

	public List<ResCustomer> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize )
	{
		return resCustomerDAO.search(  criteria  , firstPage , pageSize  );
	}

	public List<ResCustomer> loadAll(Integer startPage , Integer pageSize )
	{

		return resCustomerDAO.loadAll( startPage ,  pageSize );
	}

}
