/*
 * Created on 20 Mar 2016 ( Time 14:19:37 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResReservationStatusService;
import com.itigeeks.restaurant.common.entity.schema.ResReservationStatus;
import com.itigeeks.restaurant.dataaccess.dao.ResReservationStatusDAO;
/**
 * Implementation of ResReservationStatusService
 */
@Service
public class ResReservationStatusServiceImpl implements ResReservationStatusService {


	@Autowired
	private ResReservationStatusDAO resReservationStatusDAO;

	public void delete(ResReservationStatus resReservationStatus)
	{
		 resReservationStatusDAO.delete(resReservationStatus);
	}
	
	public ResReservationStatus saveOrUpdate(ResReservationStatus resReservationStatus)
	{
		return resReservationStatusDAO.saveOrUpdate( resReservationStatus);
	}

	public ResReservationStatus load(Long id )
	{
		return resReservationStatusDAO.load( id );
	}

	
	public List<ResReservationStatus> loadAll()
	{
		return resReservationStatusDAO.loadAll();
	}


	public List<ResReservationStatus> loadByNamedQuery(String queryName)
	{
		return resReservationStatusDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResReservationStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resReservationStatusDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResReservationStatus> search( Map<String, Object> criteria )
	{
		return resReservationStatusDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resReservationStatusDAO.countAll();
	}

}
