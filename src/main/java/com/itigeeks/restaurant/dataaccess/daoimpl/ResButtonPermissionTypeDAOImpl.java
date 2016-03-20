package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResButtonPermissionType;
import com.itigeeks.restaurant.dataaccess.dao.ResButtonPermissionTypeDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResButtonPermissionTypeDAOImpl extends AbstractDAO implements ResButtonPermissionTypeDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResButtonPermissionType resButtonPermissionType) 
	{
		super.delete(resButtonPermissionType);
	}
	
	public ResButtonPermissionType saveOrUpdate(ResButtonPermissionType resButtonPermissionType) 
	{
		return (ResButtonPermissionType) super.saveOrUpdate(resButtonPermissionType);
	}

	public ResButtonPermissionType load(Long id )
	{
		return (ResButtonPermissionType) super.get(ResButtonPermissionType.class , id);
	}

	
	public List<ResButtonPermissionType> loadAll()
	{
		return (List<ResButtonPermissionType>) super.loadAll(ResButtonPermissionType.class);
	}


	public List<ResButtonPermissionType> loadByNamedQuery(String queryName)
	{
		
		return (List<ResButtonPermissionType>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResButtonPermissionType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResButtonPermissionType>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResButtonPermissionType> search( Map<String, Object> criteria )
	{
		return super.search( ResButtonPermissionType.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResButtonPermissionType.class);
	}
}
