package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReportSettings;
import com.itigeeks.restaurant.dataaccess.dao.ResReportSettingsDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResReportSettingsDAOImpl extends AbstractDAO implements ResReportSettingsDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResReportSettings resReportSettings) 
	{
		super.delete(resReportSettings);
	}
	
	public ResReportSettings saveOrUpdate(ResReportSettings resReportSettings) 
	{
		return (ResReportSettings) super.saveOrUpdate(resReportSettings);
	}

	public ResReportSettings load(Long id )
	{
		return (ResReportSettings) super.get(ResReportSettings.class , id);
	}

	
	public List<ResReportSettings> loadAll()
	{
		return (List<ResReportSettings>) super.loadAll(ResReportSettings.class);
	}


	public List<ResReportSettings> loadByNamedQuery(String queryName)
	{
		
		return (List<ResReportSettings>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResReportSettings> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResReportSettings>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResReportSettings> search( Map<String, Object> criteria )
	{
		return super.search( ResReportSettings.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResReportSettings.class);
	}
}
