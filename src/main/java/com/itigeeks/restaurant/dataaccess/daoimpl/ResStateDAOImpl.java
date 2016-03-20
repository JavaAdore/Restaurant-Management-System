package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResState;
import com.itigeeks.restaurant.dataaccess.dao.ResStateDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResStateDAOImpl extends AbstractDAO implements ResStateDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResState resState) 
	{
		super.delete(resState);
	}
	
	public ResState saveOrUpdate(ResState resState) 
	{
		return (ResState) super.saveOrUpdate(resState);
	}

	public ResState load(Long id )
	{
		return (ResState) super.get(ResState.class , id);
	}

	
	public List<ResState> loadAll()
	{
		return (List<ResState>) super.loadAll(ResState.class);
	}


	public List<ResState> loadByNamedQuery(String queryName)
	{
		
		return (List<ResState>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResState> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResState>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResState> search( Map<String, Object> criteria )
	{
		return super.search( ResState.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResState.class);
	}
}
