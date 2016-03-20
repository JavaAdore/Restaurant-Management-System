/*
 * Created on 20 Mar 2016 ( Time 14:19:36 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResReservationConfirmationService;
import com.itigeeks.restaurant.common.entity.schema.ResReservationConfirmation;
import com.itigeeks.restaurant.dataaccess.dao.ResReservationConfirmationDAO;
/**
 * Implementation of ResReservationConfirmationService
 */
@Service
public class ResReservationConfirmationServiceImpl implements ResReservationConfirmationService {


	@Autowired
	private ResReservationConfirmationDAO resReservationConfirmationDAO;

	public void delete(ResReservationConfirmation resReservationConfirmation)
	{
		 resReservationConfirmationDAO.delete(resReservationConfirmation);
	}
	
	public ResReservationConfirmation saveOrUpdate(ResReservationConfirmation resReservationConfirmation)
	{
		return resReservationConfirmationDAO.saveOrUpdate( resReservationConfirmation);
	}

	public ResReservationConfirmation load(Long id )
	{
		return resReservationConfirmationDAO.load( id );
	}

	
	public List<ResReservationConfirmation> loadAll()
	{
		return resReservationConfirmationDAO.loadAll();
	}


	public List<ResReservationConfirmation> loadByNamedQuery(String queryName)
	{
		return resReservationConfirmationDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResReservationConfirmation> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resReservationConfirmationDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResReservationConfirmation> search( Map<String, Object> criteria )
	{
		return resReservationConfirmationDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resReservationConfirmationDAO.countAll();
	}

}