package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResLogType;
import com.itigeeks.restaurant.dataaccess.dao.ResLogTypeDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResLogTypeDAOImpl extends AbstractDAO implements ResLogTypeDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResLogType resLogType) 
	{
		super.delete(resLogType);
	}
	
	public ResLogType saveOrUpdate(ResLogType resLogType) 
	{
		return (ResLogType) super.saveOrUpdate(resLogType);
	}

	public ResLogType load(Long id )
	{
		return (ResLogType) super.get(ResLogType.class , id);
	}

	
	public List<ResLogType> loadAll()
	{
		return (List<ResLogType>) super.loadAll(ResLogType.class);
	}


	public List<ResLogType> loadByNamedQuery(String queryName)
	{
		
		return (List<ResLogType>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResLogType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResLogType>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResLogType> search( Map<String, Object> criteria )
	{
		return super.search( ResLogType.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResLogType.class);
	}
}
