/*
 * Created on 20 Mar 2016 ( Time 14:19:38 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResZreportPermissionService;
import com.itigeeks.restaurant.common.entity.schema.ResZreportPermission;
import com.itigeeks.restaurant.dataaccess.dao.ResZreportPermissionDAO;
/**
 * Implementation of ResZreportPermissionService
 */
@Service
public class ResZreportPermissionServiceImpl implements ResZreportPermissionService {


	@Autowired
	private ResZreportPermissionDAO resZreportPermissionDAO;

	public void delete(ResZreportPermission resZreportPermission)
	{
		 resZreportPermissionDAO.delete(resZreportPermission);
	}
	
	public ResZreportPermission saveOrUpdate(ResZreportPermission resZreportPermission)
	{
		return resZreportPermissionDAO.saveOrUpdate( resZreportPermission);
	}

	public ResZreportPermission load(Long id )
	{
		return resZreportPermissionDAO.load( id );
	}

	
	public List<ResZreportPermission> loadAll()
	{
		return resZreportPermissionDAO.loadAll();
	}


	public List<ResZreportPermission> loadByNamedQuery(String queryName)
	{
		return resZreportPermissionDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResZreportPermission> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resZreportPermissionDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResZreportPermission> search( Map<String, Object> criteria )
	{
		return resZreportPermissionDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resZreportPermissionDAO.countAll();
	}

}