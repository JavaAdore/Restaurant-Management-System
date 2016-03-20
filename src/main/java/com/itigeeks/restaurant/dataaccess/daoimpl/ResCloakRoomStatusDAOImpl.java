package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCloakRoomStatus;
import com.itigeeks.restaurant.dataaccess.dao.ResCloakRoomStatusDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResCloakRoomStatusDAOImpl extends AbstractDAO implements ResCloakRoomStatusDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResCloakRoomStatus resCloakRoomStatus) 
	{
		super.delete(resCloakRoomStatus);
	}
	
	public ResCloakRoomStatus saveOrUpdate(ResCloakRoomStatus resCloakRoomStatus) 
	{
		return (ResCloakRoomStatus) super.saveOrUpdate(resCloakRoomStatus);
	}

	public ResCloakRoomStatus load(Long id )
	{
		return (ResCloakRoomStatus) super.get(ResCloakRoomStatus.class , id);
	}

	
	public List<ResCloakRoomStatus> loadAll()
	{
		return (List<ResCloakRoomStatus>) super.loadAll(ResCloakRoomStatus.class);
	}


	public List<ResCloakRoomStatus> loadByNamedQuery(String queryName)
	{
		
		return (List<ResCloakRoomStatus>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResCloakRoomStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResCloakRoomStatus>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResCloakRoomStatus> search( Map<String, Object> criteria )
	{
		return super.search( ResCloakRoomStatus.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResCloakRoomStatus.class);
	}
}
