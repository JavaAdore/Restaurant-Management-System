package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderDeleteLog;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderDeleteLogDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResOrderDeleteLogDAOImpl extends AbstractDAO implements ResOrderDeleteLogDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResOrderDeleteLog resOrderDeleteLog) 
	{
		super.delete(resOrderDeleteLog);
	}
	
	public ResOrderDeleteLog saveOrUpdate(ResOrderDeleteLog resOrderDeleteLog) 
	{
		return (ResOrderDeleteLog) super.saveOrUpdate(resOrderDeleteLog);
	}

	public ResOrderDeleteLog load(Long id )
	{
		return (ResOrderDeleteLog) super.get(ResOrderDeleteLog.class , id);
	}

	
	public List<ResOrderDeleteLog> loadAll()
	{
		return (List<ResOrderDeleteLog>) super.loadAll(ResOrderDeleteLog.class);
	}


	public List<ResOrderDeleteLog> loadByNamedQuery(String queryName)
	{
		
		return (List<ResOrderDeleteLog>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResOrderDeleteLog> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResOrderDeleteLog>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResOrderDeleteLog> search( Map<String, Object> criteria )
	{
		return super.search( ResOrderDeleteLog.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResOrderDeleteLog.class);
	}

	public List<ResOrderDeleteLog> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResOrderDeleteLog.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResOrderDeleteLog> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResOrderDeleteLog.class , startPage , pageSize);
	}

}
