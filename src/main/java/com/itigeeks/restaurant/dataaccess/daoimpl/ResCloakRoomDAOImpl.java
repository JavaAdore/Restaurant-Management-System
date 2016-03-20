package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCloakRoom;
import com.itigeeks.restaurant.dataaccess.dao.ResCloakRoomDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResCloakRoomDAOImpl extends AbstractDAO implements ResCloakRoomDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResCloakRoom resCloakRoom) 
	{
		super.delete(resCloakRoom);
	}
	
	public ResCloakRoom saveOrUpdate(ResCloakRoom resCloakRoom) 
	{
		return (ResCloakRoom) super.saveOrUpdate(resCloakRoom);
	}

	public ResCloakRoom load(Long id )
	{
		return (ResCloakRoom) super.get(ResCloakRoom.class , id);
	}

	
	public List<ResCloakRoom> loadAll()
	{
		return (List<ResCloakRoom>) super.loadAll(ResCloakRoom.class);
	}


	public List<ResCloakRoom> loadByNamedQuery(String queryName)
	{
		
		return (List<ResCloakRoom>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResCloakRoom> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResCloakRoom>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResCloakRoom> search( Map<String, Object> criteria )
	{
		return super.search( ResCloakRoom.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResCloakRoom.class);
	}
}
