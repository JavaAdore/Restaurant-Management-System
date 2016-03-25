/*
 * Created on 24 Mar 2016 ( Time 12:52:08 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResProductWasteHistoryService;
import com.itigeeks.restaurant.common.entity.schema.ResProductWasteHistory;
import com.itigeeks.restaurant.dataaccess.dao.ResProductWasteHistoryDAO;
/**
 * Implementation of ResProductWasteHistoryService
 */
@Service
public class ResProductWasteHistoryServiceImpl implements ResProductWasteHistoryService {


	@Autowired
	private ResProductWasteHistoryDAO resProductWasteHistoryDAO;

	public void delete(ResProductWasteHistory resProductWasteHistory)
	{
		 resProductWasteHistoryDAO.delete(resProductWasteHistory);
	}
	
	public ResProductWasteHistory saveOrUpdate(ResProductWasteHistory resProductWasteHistory)
	{
		return resProductWasteHistoryDAO.saveOrUpdate( resProductWasteHistory);
	}

	public ResProductWasteHistory load(Long id )
	{
		return resProductWasteHistoryDAO.load( id );
	}

	
	public List<ResProductWasteHistory> loadAll()
	{
		return resProductWasteHistoryDAO.loadAll();
	}


	public List<ResProductWasteHistory> loadByNamedQuery(String queryName)
	{
		return resProductWasteHistoryDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResProductWasteHistory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resProductWasteHistoryDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResProductWasteHistory> search( Map<String, Object> criteria )
	{
		return resProductWasteHistoryDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resProductWasteHistoryDAO.countAll();
	}

	public List<ResProductWasteHistory> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize )
	{
		return resProductWasteHistoryDAO.search(  criteria  , firstPage , pageSize  );
	}

	public List<ResProductWasteHistory> loadAll(Integer startPage , Integer pageSize )
	{

		return resProductWasteHistoryDAO.loadAll( startPage ,  pageSize );
	}

}
