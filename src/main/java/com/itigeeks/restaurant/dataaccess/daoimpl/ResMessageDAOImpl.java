package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResMessage;
import com.itigeeks.restaurant.dataaccess.dao.ResMessageDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResMessageDAOImpl extends AbstractDAO implements ResMessageDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResMessage resMessage) 
	{
		super.delete(resMessage);
	}
	
	public ResMessage saveOrUpdate(ResMessage resMessage) 
	{
		return (ResMessage) super.saveOrUpdate(resMessage);
	}

	public ResMessage load(Long id )
	{
		return (ResMessage) super.get(ResMessage.class , id);
	}

	
	public List<ResMessage> loadAll()
	{
		return (List<ResMessage>) super.loadAll(ResMessage.class);
	}


	public List<ResMessage> loadByNamedQuery(String queryName)
	{
		
		return (List<ResMessage>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResMessage> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResMessage>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResMessage> search( Map<String, Object> criteria )
	{
		return super.search( ResMessage.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResMessage.class);
	}
}
