/*
 * Created on 20 Mar 2016 ( Time 14:19:38 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResZreportLogService;
import com.itigeeks.restaurant.common.entity.schema.ResZreportLog;
import com.itigeeks.restaurant.dataaccess.dao.ResZreportLogDAO;
/**
 * Implementation of ResZreportLogService
 */
@Service
public class ResZreportLogServiceImpl implements ResZreportLogService {


	@Autowired
	private ResZreportLogDAO resZreportLogDAO;

	public void delete(ResZreportLog resZreportLog)
	{
		 resZreportLogDAO.delete(resZreportLog);
	}
	
	public ResZreportLog saveOrUpdate(ResZreportLog resZreportLog)
	{
		return resZreportLogDAO.saveOrUpdate( resZreportLog);
	}

	public ResZreportLog load(Long id )
	{
		return resZreportLogDAO.load( id );
	}

	
	public List<ResZreportLog> loadAll()
	{
		return resZreportLogDAO.loadAll();
	}


	public List<ResZreportLog> loadByNamedQuery(String queryName)
	{
		return resZreportLogDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResZreportLog> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resZreportLogDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResZreportLog> search( Map<String, Object> criteria )
	{
		return resZreportLogDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resZreportLogDAO.countAll();
	}

}