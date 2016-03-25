/*
 * Created on 24 Mar 2016 ( Time 12:52:08 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResPromotionalOfferService;
import com.itigeeks.restaurant.common.entity.schema.ResPromotionalOffer;
import com.itigeeks.restaurant.dataaccess.dao.ResPromotionalOfferDAO;
/**
 * Implementation of ResPromotionalOfferService
 */
@Service
public class ResPromotionalOfferServiceImpl implements ResPromotionalOfferService {


	@Autowired
	private ResPromotionalOfferDAO resPromotionalOfferDAO;

	public void delete(ResPromotionalOffer resPromotionalOffer)
	{
		 resPromotionalOfferDAO.delete(resPromotionalOffer);
	}
	
	public ResPromotionalOffer saveOrUpdate(ResPromotionalOffer resPromotionalOffer)
	{
		return resPromotionalOfferDAO.saveOrUpdate( resPromotionalOffer);
	}

	public ResPromotionalOffer load(Long id )
	{
		return resPromotionalOfferDAO.load( id );
	}

	
	public List<ResPromotionalOffer> loadAll()
	{
		return resPromotionalOfferDAO.loadAll();
	}


	public List<ResPromotionalOffer> loadByNamedQuery(String queryName)
	{
		return resPromotionalOfferDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResPromotionalOffer> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resPromotionalOfferDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResPromotionalOffer> search( Map<String, Object> criteria )
	{
		return resPromotionalOfferDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resPromotionalOfferDAO.countAll();
	}

	public List<ResPromotionalOffer> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize )
	{
		return resPromotionalOfferDAO.search(  criteria  , firstPage , pageSize  );
	}

	public List<ResPromotionalOffer> loadAll(Integer startPage , Integer pageSize )
	{

		return resPromotionalOfferDAO.loadAll( startPage ,  pageSize );
	}

}
