/*
 * Created on 20 Mar 2016 ( Time 14:19:34 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResOrderService;
import com.itigeeks.restaurant.common.entity.schema.ResOrder;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderDAO;
/**
 * Implementation of ResOrderService
 */
@Service
public class ResOrderServiceImpl implements ResOrderService {


	@Autowired
	private ResOrderDAO resOrderDAO;

	public void delete(ResOrder resOrder)
	{
		 resOrderDAO.delete(resOrder);
	}
	
	public ResOrder saveOrUpdate(ResOrder resOrder)
	{
		return resOrderDAO.saveOrUpdate( resOrder);
	}

	public ResOrder load(Long id )
	{
		return resOrderDAO.load( id );
	}

	
	public List<ResOrder> loadAll()
	{
		return resOrderDAO.loadAll();
	}


	public List<ResOrder> loadByNamedQuery(String queryName)
	{
		return resOrderDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResOrder> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resOrderDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResOrder> search( Map<String, Object> criteria )
	{
		return resOrderDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resOrderDAO.countAll();
	}

}
