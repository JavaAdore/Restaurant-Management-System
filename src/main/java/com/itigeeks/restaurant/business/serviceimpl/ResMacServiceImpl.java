/*
 * Created on 24 Mar 2016 ( Time 12:52:06 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResMacService;
import com.itigeeks.restaurant.common.entity.schema.ResMac;
import com.itigeeks.restaurant.dataaccess.dao.ResMacDAO;
/**
 * Implementation of ResMacService
 */
@Service
public class ResMacServiceImpl implements ResMacService {


	@Autowired
	private ResMacDAO resMacDAO;

	public void delete(ResMac resMac)
	{
		 resMacDAO.delete(resMac);
	}
	
	public ResMac saveOrUpdate(ResMac resMac)
	{
		return resMacDAO.saveOrUpdate( resMac);
	}

	public ResMac load(Long id )
	{
		return resMacDAO.load( id );
	}

	
	public List<ResMac> loadAll()
	{
		return resMacDAO.loadAll();
	}


	public List<ResMac> loadByNamedQuery(String queryName)
	{
		return resMacDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResMac> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resMacDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResMac> search( Map<String, Object> criteria )
	{
		return resMacDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resMacDAO.countAll();
	}

	public List<ResMac> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize )
	{
		return resMacDAO.search(  criteria  , firstPage , pageSize  );
	}

	public List<ResMac> loadAll(Integer startPage , Integer pageSize )
	{

		return resMacDAO.loadAll( startPage ,  pageSize );
	}

}
