package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResSettings;
import com.itigeeks.restaurant.dataaccess.dao.ResSettingsDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResSettingsDAOImpl extends AbstractDAO implements ResSettingsDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResSettings resSettings) 
	{
		super.delete(resSettings);
	}
	
	public ResSettings saveOrUpdate(ResSettings resSettings) 
	{
		return (ResSettings) super.saveOrUpdate(resSettings);
	}

	public ResSettings load(Long id )
	{
		return (ResSettings) super.get(ResSettings.class , id);
	}

	
	public List<ResSettings> loadAll()
	{
		return (List<ResSettings>) super.loadAll(ResSettings.class);
	}


	public List<ResSettings> loadByNamedQuery(String queryName)
	{
		
		return (List<ResSettings>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResSettings> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResSettings>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResSettings> search( Map<String, Object> criteria )
	{
		return super.search( ResSettings.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResSettings.class);
	}
}
