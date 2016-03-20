package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderActionType;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderActionTypeDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResOrderActionTypeDAOImpl extends AbstractDAO implements ResOrderActionTypeDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResOrderActionType resOrderActionType) 
	{
		super.delete(resOrderActionType);
	}
	
	public ResOrderActionType saveOrUpdate(ResOrderActionType resOrderActionType) 
	{
		return (ResOrderActionType) super.saveOrUpdate(resOrderActionType);
	}

	public ResOrderActionType load(Long id )
	{
		return (ResOrderActionType) super.get(ResOrderActionType.class , id);
	}

	
	public List<ResOrderActionType> loadAll()
	{
		return (List<ResOrderActionType>) super.loadAll(ResOrderActionType.class);
	}


	public List<ResOrderActionType> loadByNamedQuery(String queryName)
	{
		
		return (List<ResOrderActionType>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResOrderActionType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResOrderActionType>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResOrderActionType> search( Map<String, Object> criteria )
	{
		return super.search( ResOrderActionType.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResOrderActionType.class);
	}
}
