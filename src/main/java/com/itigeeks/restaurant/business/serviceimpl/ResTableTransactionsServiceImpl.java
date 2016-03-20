/*
 * Created on 20 Mar 2016 ( Time 14:19:37 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResTableTransactionsService;
import com.itigeeks.restaurant.common.entity.schema.ResTableTransactions;
import com.itigeeks.restaurant.dataaccess.dao.ResTableTransactionsDAO;
/**
 * Implementation of ResTableTransactionsService
 */
@Service
public class ResTableTransactionsServiceImpl implements ResTableTransactionsService {


	@Autowired
	private ResTableTransactionsDAO resTableTransactionsDAO;

	public void delete(ResTableTransactions resTableTransactions)
	{
		 resTableTransactionsDAO.delete(resTableTransactions);
	}
	
	public ResTableTransactions saveOrUpdate(ResTableTransactions resTableTransactions)
	{
		return resTableTransactionsDAO.saveOrUpdate( resTableTransactions);
	}

	public ResTableTransactions load(Long id )
	{
		return resTableTransactionsDAO.load( id );
	}

	
	public List<ResTableTransactions> loadAll()
	{
		return resTableTransactionsDAO.loadAll();
	}


	public List<ResTableTransactions> loadByNamedQuery(String queryName)
	{
		return resTableTransactionsDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResTableTransactions> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resTableTransactionsDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResTableTransactions> search( Map<String, Object> criteria )
	{
		return resTableTransactionsDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resTableTransactionsDAO.countAll();
	}

}
