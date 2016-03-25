package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDashboardSettings;
import com.itigeeks.restaurant.dataaccess.dao.ResDashboardSettingsDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResDashboardSettingsDAOImpl extends AbstractDAO implements ResDashboardSettingsDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResDashboardSettings resDashboardSettings) 
	{
		super.delete(resDashboardSettings);
	}
	
	public ResDashboardSettings saveOrUpdate(ResDashboardSettings resDashboardSettings) 
	{
		return (ResDashboardSettings) super.saveOrUpdate(resDashboardSettings);
	}

	public ResDashboardSettings load(Long id )
	{
		return (ResDashboardSettings) super.get(ResDashboardSettings.class , id);
	}

	
	public List<ResDashboardSettings> loadAll()
	{
		return (List<ResDashboardSettings>) super.loadAll(ResDashboardSettings.class);
	}


	public List<ResDashboardSettings> loadByNamedQuery(String queryName)
	{
		
		return (List<ResDashboardSettings>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResDashboardSettings> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResDashboardSettings>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResDashboardSettings> search( Map<String, Object> criteria )
	{
		return super.search( ResDashboardSettings.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResDashboardSettings.class);
	}

	public List<ResDashboardSettings> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResDashboardSettings.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResDashboardSettings> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResDashboardSettings.class , startPage , pageSize);
	}

}
