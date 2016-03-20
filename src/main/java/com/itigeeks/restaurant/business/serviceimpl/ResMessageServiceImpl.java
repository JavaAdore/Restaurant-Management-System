/*
 * Created on 20 Mar 2016 ( Time 14:19:34 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResMessageService;
import com.itigeeks.restaurant.common.entity.schema.ResMessage;
import com.itigeeks.restaurant.dataaccess.dao.ResMessageDAO;
/**
 * Implementation of ResMessageService
 */
@Service
public class ResMessageServiceImpl implements ResMessageService {


	@Autowired
	private ResMessageDAO resMessageDAO;

	public void delete(ResMessage resMessage)
	{
		 resMessageDAO.delete(resMessage);
	}
	
	public ResMessage saveOrUpdate(ResMessage resMessage)
	{
		return resMessageDAO.saveOrUpdate( resMessage);
	}

	public ResMessage load(Long id )
	{
		return resMessageDAO.load( id );
	}

	
	public List<ResMessage> loadAll()
	{
		return resMessageDAO.loadAll();
	}


	public List<ResMessage> loadByNamedQuery(String queryName)
	{
		return resMessageDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResMessage> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resMessageDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResMessage> search( Map<String, Object> criteria )
	{
		return resMessageDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resMessageDAO.countAll();
	}

}
