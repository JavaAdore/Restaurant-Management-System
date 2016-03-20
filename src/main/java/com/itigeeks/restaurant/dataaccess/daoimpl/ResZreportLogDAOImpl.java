package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResZreportLog;
import com.itigeeks.restaurant.dataaccess.dao.ResZreportLogDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResZreportLogDAOImpl extends AbstractDAO implements ResZreportLogDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResZreportLog resZreportLog) 
	{
		super.delete(resZreportLog);
	}
	
	public ResZreportLog saveOrUpdate(ResZreportLog resZreportLog) 
	{
		return (ResZreportLog) super.saveOrUpdate(resZreportLog);
	}

	public ResZreportLog load(Long id )
	{
		return (ResZreportLog) super.get(ResZreportLog.class , id);
	}

	
	public List<ResZreportLog> loadAll()
	{
		return (List<ResZreportLog>) super.loadAll(ResZreportLog.class);
	}


	public List<ResZreportLog> loadByNamedQuery(String queryName)
	{
		
		return (List<ResZreportLog>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResZreportLog> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResZreportLog>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResZreportLog> search( Map<String, Object> criteria )
	{
		return super.search( ResZreportLog.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResZreportLog.class);
	}
}
