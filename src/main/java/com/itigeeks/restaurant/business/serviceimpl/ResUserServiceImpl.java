/*
 * Created on 20 Mar 2016 ( Time 14:19:38 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResUserService;
import com.itigeeks.restaurant.common.entity.schema.ResUser;
import com.itigeeks.restaurant.dataaccess.dao.ResUserDAO;
/**
 * Implementation of ResUserService
 */
@Service
public class ResUserServiceImpl implements ResUserService {


	@Autowired
	private ResUserDAO resUserDAO;

	public void delete(ResUser resUser)
	{
		 resUserDAO.delete(resUser);
	}
	
	public ResUser saveOrUpdate(ResUser resUser)
	{
		return resUserDAO.saveOrUpdate( resUser);
	}

	public ResUser load(Long id )
	{
		return resUserDAO.load( id );
	}

	
	public List<ResUser> loadAll()
	{
		return resUserDAO.loadAll();
	}


	public List<ResUser> loadByNamedQuery(String queryName)
	{
		return resUserDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResUser> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resUserDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResUser> search( Map<String, Object> criteria )
	{
		return resUserDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resUserDAO.countAll();
	}

}