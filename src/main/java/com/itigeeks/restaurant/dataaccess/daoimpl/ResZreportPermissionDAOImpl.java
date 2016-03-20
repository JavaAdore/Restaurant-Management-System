package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResZreportPermission;
import com.itigeeks.restaurant.dataaccess.dao.ResZreportPermissionDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResZreportPermissionDAOImpl extends AbstractDAO implements ResZreportPermissionDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResZreportPermission resZreportPermission) 
	{
		super.delete(resZreportPermission);
	}
	
	public ResZreportPermission saveOrUpdate(ResZreportPermission resZreportPermission) 
	{
		return (ResZreportPermission) super.saveOrUpdate(resZreportPermission);
	}

	public ResZreportPermission load(Long id )
	{
		return (ResZreportPermission) super.get(ResZreportPermission.class , id);
	}

	
	public List<ResZreportPermission> loadAll()
	{
		return (List<ResZreportPermission>) super.loadAll(ResZreportPermission.class);
	}


	public List<ResZreportPermission> loadByNamedQuery(String queryName)
	{
		
		return (List<ResZreportPermission>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResZreportPermission> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResZreportPermission>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResZreportPermission> search( Map<String, Object> criteria )
	{
		return super.search( ResZreportPermission.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResZreportPermission.class);
	}
}
