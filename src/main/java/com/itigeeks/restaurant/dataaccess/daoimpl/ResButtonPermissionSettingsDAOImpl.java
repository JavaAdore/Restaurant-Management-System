package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResButtonPermissionSettings;
import com.itigeeks.restaurant.dataaccess.dao.ResButtonPermissionSettingsDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResButtonPermissionSettingsDAOImpl extends AbstractDAO implements ResButtonPermissionSettingsDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResButtonPermissionSettings resButtonPermissionSettings) 
	{
		super.delete(resButtonPermissionSettings);
	}
	
	public ResButtonPermissionSettings saveOrUpdate(ResButtonPermissionSettings resButtonPermissionSettings) 
	{
		return (ResButtonPermissionSettings) super.saveOrUpdate(resButtonPermissionSettings);
	}

	public ResButtonPermissionSettings load(Long id )
	{
		return (ResButtonPermissionSettings) super.get(ResButtonPermissionSettings.class , id);
	}

	
	public List<ResButtonPermissionSettings> loadAll()
	{
		return (List<ResButtonPermissionSettings>) super.loadAll(ResButtonPermissionSettings.class);
	}


	public List<ResButtonPermissionSettings> loadByNamedQuery(String queryName)
	{
		
		return (List<ResButtonPermissionSettings>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResButtonPermissionSettings> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResButtonPermissionSettings>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResButtonPermissionSettings> search( Map<String, Object> criteria )
	{
		return super.search( ResButtonPermissionSettings.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResButtonPermissionSettings.class);
	}

	public List<ResButtonPermissionSettings> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResButtonPermissionSettings.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResButtonPermissionSettings> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResButtonPermissionSettings.class , startPage , pageSize);
	}

}
