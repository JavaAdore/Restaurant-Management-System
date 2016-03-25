/*
 * Created on 24 Mar 2016 ( Time 12:52:07 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResOrderChildService;
import com.itigeeks.restaurant.common.entity.schema.ResOrderChild;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderChildDAO;
/**
 * Implementation of ResOrderChildService
 */
@Service
public class ResOrderChildServiceImpl implements ResOrderChildService {


	@Autowired
	private ResOrderChildDAO resOrderChildDAO;

	public void delete(ResOrderChild resOrderChild)
	{
		 resOrderChildDAO.delete(resOrderChild);
	}
	
	public ResOrderChild saveOrUpdate(ResOrderChild resOrderChild)
	{
		return resOrderChildDAO.saveOrUpdate( resOrderChild);
	}

	public ResOrderChild load(Long id )
	{
		return resOrderChildDAO.load( id );
	}

	
	public List<ResOrderChild> loadAll()
	{
		return resOrderChildDAO.loadAll();
	}


	public List<ResOrderChild> loadByNamedQuery(String queryName)
	{
		return resOrderChildDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResOrderChild> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resOrderChildDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResOrderChild> search( Map<String, Object> criteria )
	{
		return resOrderChildDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resOrderChildDAO.countAll();
	}

	public List<ResOrderChild> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize )
	{
		return resOrderChildDAO.search(  criteria  , firstPage , pageSize  );
	}

	public List<ResOrderChild> loadAll(Integer startPage , Integer pageSize )
	{

		return resOrderChildDAO.loadAll( startPage ,  pageSize );
	}

}
