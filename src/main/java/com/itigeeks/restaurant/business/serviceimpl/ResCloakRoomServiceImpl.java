/*
 * Created on 20 Mar 2016 ( Time 14:19:33 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResCloakRoomService;
import com.itigeeks.restaurant.common.entity.schema.ResCloakRoom;
import com.itigeeks.restaurant.dataaccess.dao.ResCloakRoomDAO;
/**
 * Implementation of ResCloakRoomService
 */
@Service
public class ResCloakRoomServiceImpl implements ResCloakRoomService {


	@Autowired
	private ResCloakRoomDAO resCloakRoomDAO;

	public void delete(ResCloakRoom resCloakRoom)
	{
		 resCloakRoomDAO.delete(resCloakRoom);
	}
	
	public ResCloakRoom saveOrUpdate(ResCloakRoom resCloakRoom)
	{
		return resCloakRoomDAO.saveOrUpdate( resCloakRoom);
	}

	public ResCloakRoom load(Long id )
	{
		return resCloakRoomDAO.load( id );
	}

	
	public List<ResCloakRoom> loadAll()
	{
		return resCloakRoomDAO.loadAll();
	}


	public List<ResCloakRoom> loadByNamedQuery(String queryName)
	{
		return resCloakRoomDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResCloakRoom> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resCloakRoomDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResCloakRoom> search( Map<String, Object> criteria )
	{
		return resCloakRoomDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resCloakRoomDAO.countAll();
	}

}
