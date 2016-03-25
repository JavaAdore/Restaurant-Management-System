/*
 * Created on 24 Mar 2016 ( Time 12:52:05 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResCloakRoomStatusService;
import com.itigeeks.restaurant.common.entity.schema.ResCloakRoomStatus;
import com.itigeeks.restaurant.dataaccess.dao.ResCloakRoomStatusDAO;
/**
 * Implementation of ResCloakRoomStatusService
 */
@Service
public class ResCloakRoomStatusServiceImpl implements ResCloakRoomStatusService {


	@Autowired
	private ResCloakRoomStatusDAO resCloakRoomStatusDAO;

	public void delete(ResCloakRoomStatus resCloakRoomStatus)
	{
		 resCloakRoomStatusDAO.delete(resCloakRoomStatus);
	}
	
	public ResCloakRoomStatus saveOrUpdate(ResCloakRoomStatus resCloakRoomStatus)
	{
		return resCloakRoomStatusDAO.saveOrUpdate( resCloakRoomStatus);
	}

	public ResCloakRoomStatus load(Long id )
	{
		return resCloakRoomStatusDAO.load( id );
	}

	
	public List<ResCloakRoomStatus> loadAll()
	{
		return resCloakRoomStatusDAO.loadAll();
	}


	public List<ResCloakRoomStatus> loadByNamedQuery(String queryName)
	{
		return resCloakRoomStatusDAO.loadByNamedQuery(queryName);
	}

	
	public List<ResCloakRoomStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return resCloakRoomStatusDAO.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResCloakRoomStatus> search( Map<String, Object> criteria )
	{
		return resCloakRoomStatusDAO.search(  criteria );
	}

	
	public Integer countAll()
	{
		return resCloakRoomStatusDAO.countAll();
	}

	public List<ResCloakRoomStatus> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize )
	{
		return resCloakRoomStatusDAO.search(  criteria  , firstPage , pageSize  );
	}

	public List<ResCloakRoomStatus> loadAll(Integer startPage , Integer pageSize )
	{

		return resCloakRoomStatusDAO.loadAll( startPage ,  pageSize );
	}

}
