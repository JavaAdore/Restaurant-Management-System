/*
 * Created on 20 Mar 2016 ( Time 14:19:36 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResPromotionProductService;
import com.itigeeks.restaurant.common.entity.schema.ResPromotionProduct;
import com.itigeeks.restaurant.dataaccess.dao.ResPromotionProductDAO;
/**
 * Implementation of ResPromotionProductService
 */
@Service
public class ResPromotionProductServiceImpl implements ResPromotionProductService {


	@Autowired
	private ResPromotionProductDAO resPromotionProductDAO;

	public void delete(ResPromotionProduct resPromotionProduct)
	{
		 resPromotionProductDAO.delete(resPromotionProduct);
	}
	
	public ResPromotionProduct saveOrUpdate(ResPromotionProduct resPromotionProduct)
	{
		return resPromotionProductDAO.saveOrUpdate( resPromotionProduct);
	}

	public ResPromotionProduct load(Long id )
	{
		return resPromotionProductDAO.load( id );
	}

	
	public List<ResPromotionProduct> loadAll()
	{
		return resPromotionProductDAO.loadAll();
	}


	public List<ResPromotionProduct> loadByNamedQuery(String queryName)
	{
		return resPromotionProductDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResPromotionProduct> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resPromotionProductDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResPromotionProduct> search( Map<String, Object> criteria )
	{
		return resPromotionProductDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resPromotionProductDAO.countAll();
	}

}
