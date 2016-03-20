/*
 * Created on 20 Mar 2016 ( Time 14:19:34 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResLogTypeService;
import com.itigeeks.restaurant.common.entity.schema.ResLogType;
import com.itigeeks.restaurant.dataaccess.dao.ResLogTypeDAO;
/**
 * Implementation of ResLogTypeService
 */
@Service
public class ResLogTypeServiceImpl implements ResLogTypeService {


	@Autowired
	private ResLogTypeDAO resLogTypeDAO;

	public void delete(ResLogType resLogType)
	{
		 resLogTypeDAO.delete(resLogType);
	}
	
	public ResLogType saveOrUpdate(ResLogType resLogType)
	{
		return resLogTypeDAO.saveOrUpdate( resLogType);
	}

	public ResLogType load(Long id )
	{
		return resLogTypeDAO.load( id );
	}

	
	public List<ResLogType> loadAll()
	{
		return resLogTypeDAO.loadAll();
	}


	public List<ResLogType> loadByNamedQuery(String queryName)
	{
		return resLogTypeDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResLogType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resLogTypeDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResLogType> search( Map<String, Object> criteria )
	{
		return resLogTypeDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resLogTypeDAO.countAll();
	}

}