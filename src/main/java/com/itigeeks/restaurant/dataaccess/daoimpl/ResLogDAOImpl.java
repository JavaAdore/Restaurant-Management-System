package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResLog;
import com.itigeeks.restaurant.dataaccess.dao.ResLogDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResLogDAOImpl extends AbstractDAO implements ResLogDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResLog resLog) 
	{
		super.delete(resLog);
	}
	
	public ResLog saveOrUpdate(ResLog resLog) 
	{
		return (ResLog) super.saveOrUpdate(resLog);
	}

	public ResLog load(Long id )
	{
		return (ResLog) super.get(ResLog.class , id);
	}

	
	public List<ResLog> loadAll()
	{
		return (List<ResLog>) super.loadAll(ResLog.class);
	}


	public List<ResLog> loadByNamedQuery(String queryName)
	{
		
		return (List<ResLog>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResLog> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResLog>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResLog> search( Map<String, Object> criteria )
	{
		return super.search( ResLog.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResLog.class);
	}

	public List<ResLog> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResLog.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResLog> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResLog.class , startPage , pageSize);
	}

}
