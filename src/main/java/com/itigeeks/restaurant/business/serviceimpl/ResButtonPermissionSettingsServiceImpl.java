/*
 * Created on 24 Mar 2016 ( Time 12:52:04 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResButtonPermissionSettingsService;
import com.itigeeks.restaurant.common.entity.schema.ResButtonPermissionSettings;
import com.itigeeks.restaurant.dataaccess.dao.ResButtonPermissionSettingsDAO;
/**
 * Implementation of ResButtonPermissionSettingsService
 */
@Service
public class ResButtonPermissionSettingsServiceImpl implements ResButtonPermissionSettingsService {


	@Autowired
	private ResButtonPermissionSettingsDAO resButtonPermissionSettingsDAO;

	public void delete(ResButtonPermissionSettings resButtonPermissionSettings)
	{
		 resButtonPermissionSettingsDAO.delete(resButtonPermissionSettings);
	}
	
	public ResButtonPermissionSettings saveOrUpdate(ResButtonPermissionSettings resButtonPermissionSettings)
	{
		return resButtonPermissionSettingsDAO.saveOrUpdate( resButtonPermissionSettings);
	}

	public ResButtonPermissionSettings load(Long id )
	{
		return resButtonPermissionSettingsDAO.load( id );
	}

	
	public List<ResButtonPermissionSettings> loadAll()
	{
		return resButtonPermissionSettingsDAO.loadAll();
	}


	public List<ResButtonPermissionSettings> loadByNamedQuery(String queryName)
	{
		return resButtonPermissionSettingsDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResButtonPermissionSettings> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resButtonPermissionSettingsDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResButtonPermissionSettings> search( Map<String, Object> criteria )
	{
		return resButtonPermissionSettingsDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resButtonPermissionSettingsDAO.countAll();
	}

	public List<ResButtonPermissionSettings> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize )
	{
		return resButtonPermissionSettingsDAO.search(  criteria  , firstPage , pageSize  );
	}

	public List<ResButtonPermissionSettings> loadAll(Integer startPage , Integer pageSize )
	{

		return resButtonPermissionSettingsDAO.loadAll( startPage ,  pageSize );
	}

}
