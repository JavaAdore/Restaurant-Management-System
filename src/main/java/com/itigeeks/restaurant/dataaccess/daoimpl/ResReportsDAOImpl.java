package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReports;
import com.itigeeks.restaurant.dataaccess.dao.ResReportsDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResReportsDAOImpl extends AbstractDAO implements ResReportsDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResReports resReports) 
	{
		super.delete(resReports);
	}
	
	public ResReports saveOrUpdate(ResReports resReports) 
	{
		return (ResReports) super.saveOrUpdate(resReports);
	}

	public ResReports load(Long id )
	{
		return (ResReports) super.get(ResReports.class , id);
	}

	
	public List<ResReports> loadAll()
	{
		return (List<ResReports>) super.loadAll(ResReports.class);
	}


	public List<ResReports> loadByNamedQuery(String queryName)
	{
		
		return (List<ResReports>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResReports> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResReports>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResReports> search( Map<String, Object> criteria )
	{
		return super.search( ResReports.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResReports.class);
	}
}
