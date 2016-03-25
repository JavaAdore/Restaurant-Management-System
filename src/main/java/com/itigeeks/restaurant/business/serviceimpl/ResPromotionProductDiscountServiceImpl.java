/*
 * Created on 24 Mar 2016 ( Time 12:52:08 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResPromotionProductDiscountService;
import com.itigeeks.restaurant.common.entity.schema.ResPromotionProductDiscount;
import com.itigeeks.restaurant.dataaccess.dao.ResPromotionProductDiscountDAO;
/**
 * Implementation of ResPromotionProductDiscountService
 */
@Service
public class ResPromotionProductDiscountServiceImpl implements ResPromotionProductDiscountService {


	@Autowired
	private ResPromotionProductDiscountDAO resPromotionProductDiscountDAO;

	public void delete(ResPromotionProductDiscount resPromotionProductDiscount)
	{
		 resPromotionProductDiscountDAO.delete(resPromotionProductDiscount);
	}
	
	public ResPromotionProductDiscount saveOrUpdate(ResPromotionProductDiscount resPromotionProductDiscount)
	{
		return resPromotionProductDiscountDAO.saveOrUpdate( resPromotionProductDiscount);
	}

	public ResPromotionProductDiscount load(Long id )
	{
		return resPromotionProductDiscountDAO.load( id );
	}

	
	public List<ResPromotionProductDiscount> loadAll()
	{
		return resPromotionProductDiscountDAO.loadAll();
	}


	public List<ResPromotionProductDiscount> loadByNamedQuery(String queryName)
	{
		return resPromotionProductDiscountDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResPromotionProductDiscount> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resPromotionProductDiscountDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResPromotionProductDiscount> search( Map<String, Object> criteria )
	{
		return resPromotionProductDiscountDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resPromotionProductDiscountDAO.countAll();
	}

	public List<ResPromotionProductDiscount> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize )
	{
		return resPromotionProductDiscountDAO.search(  criteria  , firstPage , pageSize  );
	}

	public List<ResPromotionProductDiscount> loadAll(Integer startPage , Integer pageSize )
	{

		return resPromotionProductDiscountDAO.loadAll( startPage ,  pageSize );
	}

}
