/*
 * Created on 20 Mar 2016 ( Time 14:19:34 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResMessageStatusService;
import com.itigeeks.restaurant.common.entity.schema.ResMessageStatus;
import com.itigeeks.restaurant.dataaccess.dao.ResMessageStatusDAO;
/**
 * Implementation of ResMessageStatusService
 */
@Service
public class ResMessageStatusServiceImpl implements ResMessageStatusService {


	@Autowired
	private ResMessageStatusDAO resMessageStatusDAO;

	public void delete(ResMessageStatus resMessageStatus)
	{
		 resMessageStatusDAO.delete(resMessageStatus);
	}
	
	public ResMessageStatus saveOrUpdate(ResMessageStatus resMessageStatus)
	{
		return resMessageStatusDAO.saveOrUpdate( resMessageStatus);
	}

	public ResMessageStatus load(Long id )
	{
		return resMessageStatusDAO.load( id );
	}

	
	public List<ResMessageStatus> loadAll()
	{
		return resMessageStatusDAO.loadAll();
	}


	public List<ResMessageStatus> loadByNamedQuery(String queryName)
	{
		return resMessageStatusDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResMessageStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resMessageStatusDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResMessageStatus> search( Map<String, Object> criteria )
	{
		return resMessageStatusDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resMessageStatusDAO.countAll();
	}

}