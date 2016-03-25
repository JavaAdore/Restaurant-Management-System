/*
 * Created on 24 Mar 2016 ( Time 12:52:09 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResVoucherService;
import com.itigeeks.restaurant.common.entity.schema.ResVoucher;
import com.itigeeks.restaurant.dataaccess.dao.ResVoucherDAO;
/**
 * Implementation of ResVoucherService
 */
@Service
public class ResVoucherServiceImpl implements ResVoucherService {


	@Autowired
	private ResVoucherDAO resVoucherDAO;

	public void delete(ResVoucher resVoucher)
	{
		 resVoucherDAO.delete(resVoucher);
	}
	
	public ResVoucher saveOrUpdate(ResVoucher resVoucher)
	{
		return resVoucherDAO.saveOrUpdate( resVoucher);
	}

	public ResVoucher load(Long id )
	{
		return resVoucherDAO.load( id );
	}

	
	public List<ResVoucher> loadAll()
	{
		return resVoucherDAO.loadAll();
	}


	public List<ResVoucher> loadByNamedQuery(String queryName)
	{
		return resVoucherDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResVoucher> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resVoucherDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResVoucher> search( Map<String, Object> criteria )
	{
		return resVoucherDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resVoucherDAO.countAll();
	}

	public List<ResVoucher> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize )
	{
		return resVoucherDAO.search(  criteria  , firstPage , pageSize  );
	}

	public List<ResVoucher> loadAll(Integer startPage , Integer pageSize )
	{

		return resVoucherDAO.loadAll( startPage ,  pageSize );
	}

}
