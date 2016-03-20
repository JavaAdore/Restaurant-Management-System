package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResNumberIdentifier;
import com.itigeeks.restaurant.dataaccess.dao.ResNumberIdentifierDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResNumberIdentifierDAOImpl extends AbstractDAO implements ResNumberIdentifierDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResNumberIdentifier resNumberIdentifier) 
	{
		super.delete(resNumberIdentifier);
	}
	
	public ResNumberIdentifier saveOrUpdate(ResNumberIdentifier resNumberIdentifier) 
	{
		return (ResNumberIdentifier) super.saveOrUpdate(resNumberIdentifier);
	}

	public ResNumberIdentifier load(Long id )
	{
		return (ResNumberIdentifier) super.get(ResNumberIdentifier.class , id);
	}

	
	public List<ResNumberIdentifier> loadAll()
	{
		return (List<ResNumberIdentifier>) super.loadAll(ResNumberIdentifier.class);
	}


	public List<ResNumberIdentifier> loadByNamedQuery(String queryName)
	{
		
		return (List<ResNumberIdentifier>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResNumberIdentifier> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResNumberIdentifier>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResNumberIdentifier> search( Map<String, Object> criteria )
	{
		return super.search( ResNumberIdentifier.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResNumberIdentifier.class);
	}
}
