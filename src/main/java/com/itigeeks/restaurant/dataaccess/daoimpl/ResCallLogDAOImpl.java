package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCallLog;
import com.itigeeks.restaurant.dataaccess.dao.ResCallLogDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResCallLogDAOImpl extends AbstractDAO implements ResCallLogDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResCallLog resCallLog) 
	{
		super.delete(resCallLog);
	}
	
	public ResCallLog saveOrUpdate(ResCallLog resCallLog) 
	{
		return (ResCallLog) super.saveOrUpdate(resCallLog);
	}

	public ResCallLog load(Long id )
	{
		return (ResCallLog) super.get(ResCallLog.class , id);
	}

	
	public List<ResCallLog> loadAll()
	{
		return (List<ResCallLog>) super.loadAll(ResCallLog.class);
	}


	public List<ResCallLog> loadByNamedQuery(String queryName)
	{
		
		return (List<ResCallLog>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResCallLog> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResCallLog>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResCallLog> search( Map<String, Object> criteria )
	{
		return super.search( ResCallLog.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResCallLog.class);
	}
}
