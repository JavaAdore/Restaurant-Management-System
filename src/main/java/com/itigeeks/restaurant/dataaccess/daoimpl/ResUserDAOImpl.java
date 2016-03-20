package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResUser;
import com.itigeeks.restaurant.dataaccess.dao.ResUserDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResUserDAOImpl extends AbstractDAO implements ResUserDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResUser resUser) 
	{
		super.delete(resUser);
	}
	
	public ResUser saveOrUpdate(ResUser resUser) 
	{
		return (ResUser) super.saveOrUpdate(resUser);
	}

	public ResUser load(Long id )
	{
		return (ResUser) super.get(ResUser.class , id);
	}

	
	public List<ResUser> loadAll()
	{
		return (List<ResUser>) super.loadAll(ResUser.class);
	}


	public List<ResUser> loadByNamedQuery(String queryName)
	{
		
		return (List<ResUser>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResUser> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResUser>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResUser> search( Map<String, Object> criteria )
	{
		return super.search( ResUser.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResUser.class);
	}
}
