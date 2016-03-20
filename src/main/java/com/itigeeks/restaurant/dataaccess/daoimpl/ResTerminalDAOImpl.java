package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResTerminal;
import com.itigeeks.restaurant.dataaccess.dao.ResTerminalDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResTerminalDAOImpl extends AbstractDAO implements ResTerminalDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResTerminal resTerminal) 
	{
		super.delete(resTerminal);
	}
	
	public ResTerminal saveOrUpdate(ResTerminal resTerminal) 
	{
		return (ResTerminal) super.saveOrUpdate(resTerminal);
	}

	public ResTerminal load(Long id )
	{
		return (ResTerminal) super.get(ResTerminal.class , id);
	}

	
	public List<ResTerminal> loadAll()
	{
		return (List<ResTerminal>) super.loadAll(ResTerminal.class);
	}


	public List<ResTerminal> loadByNamedQuery(String queryName)
	{
		
		return (List<ResTerminal>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResTerminal> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResTerminal>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResTerminal> search( Map<String, Object> criteria )
	{
		return super.search( ResTerminal.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResTerminal.class);
	}
}
