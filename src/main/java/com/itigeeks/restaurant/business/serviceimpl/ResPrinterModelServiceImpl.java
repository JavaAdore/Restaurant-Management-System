/*
 * Created on 20 Mar 2016 ( Time 14:19:35 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResPrinterModelService;
import com.itigeeks.restaurant.common.entity.schema.ResPrinterModel;
import com.itigeeks.restaurant.dataaccess.dao.ResPrinterModelDAO;
/**
 * Implementation of ResPrinterModelService
 */
@Service
public class ResPrinterModelServiceImpl implements ResPrinterModelService {


	@Autowired
	private ResPrinterModelDAO resPrinterModelDAO;

	public void delete(ResPrinterModel resPrinterModel)
	{
		 resPrinterModelDAO.delete(resPrinterModel);
	}
	
	public ResPrinterModel saveOrUpdate(ResPrinterModel resPrinterModel)
	{
		return resPrinterModelDAO.saveOrUpdate( resPrinterModel);
	}

	public ResPrinterModel load(Long id )
	{
		return resPrinterModelDAO.load( id );
	}

	
	public List<ResPrinterModel> loadAll()
	{
		return resPrinterModelDAO.loadAll();
	}


	public List<ResPrinterModel> loadByNamedQuery(String queryName)
	{
		return resPrinterModelDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResPrinterModel> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resPrinterModelDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResPrinterModel> search( Map<String, Object> criteria )
	{
		return resPrinterModelDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resPrinterModelDAO.countAll();
	}

}
