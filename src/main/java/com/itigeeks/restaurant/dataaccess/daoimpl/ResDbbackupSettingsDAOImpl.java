package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDbbackupSettings;
import com.itigeeks.restaurant.dataaccess.dao.ResDbbackupSettingsDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResDbbackupSettingsDAOImpl extends AbstractDAO implements ResDbbackupSettingsDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResDbbackupSettings resDbbackupSettings) 
	{
		super.delete(resDbbackupSettings);
	}
	
	public ResDbbackupSettings saveOrUpdate(ResDbbackupSettings resDbbackupSettings) 
	{
		return (ResDbbackupSettings) super.saveOrUpdate(resDbbackupSettings);
	}

	public ResDbbackupSettings load(Long id )
	{
		return (ResDbbackupSettings) super.get(ResDbbackupSettings.class , id);
	}

	
	public List<ResDbbackupSettings> loadAll()
	{
		return (List<ResDbbackupSettings>) super.loadAll(ResDbbackupSettings.class);
	}


	public List<ResDbbackupSettings> loadByNamedQuery(String queryName)
	{
		
		return (List<ResDbbackupSettings>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResDbbackupSettings> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResDbbackupSettings>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResDbbackupSettings> search( Map<String, Object> criteria )
	{
		return super.search( ResDbbackupSettings.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResDbbackupSettings.class);
	}

	public List<ResDbbackupSettings> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResDbbackupSettings.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResDbbackupSettings> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResDbbackupSettings.class , startPage , pageSize);
	}

}
