/*
 * Created on 20 Mar 2016 ( Time 14:19:37 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResTableService;
import com.itigeeks.restaurant.common.entity.schema.ResTable;
import com.itigeeks.restaurant.dataaccess.dao.ResTableDAO;
/**
 * Implementation of ResTableService
 */
@Service
public class ResTableServiceImpl implements ResTableService {


	@Autowired
	private ResTableDAO resTableDAO;

	public void delete(ResTable resTable)
	{
		 resTableDAO.delete(resTable);
	}
	
	public ResTable saveOrUpdate(ResTable resTable)
	{
		return resTableDAO.saveOrUpdate( resTable);
	}

	public ResTable load(Long id )
	{
		return resTableDAO.load( id );
	}

	
	public List<ResTable> loadAll()
	{
		return resTableDAO.loadAll();
	}


	public List<ResTable> loadByNamedQuery(String queryName)
	{
		return resTableDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResTable> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resTableDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResTable> search( Map<String, Object> criteria )
	{
		return resTableDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resTableDAO.countAll();
	}

}
