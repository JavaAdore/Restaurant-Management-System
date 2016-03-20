package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResFloor;
import com.itigeeks.restaurant.dataaccess.dao.ResFloorDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResFloorDAOImpl extends AbstractDAO implements ResFloorDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResFloor resFloor) 
	{
		super.delete(resFloor);
	}
	
	public ResFloor saveOrUpdate(ResFloor resFloor) 
	{
		return (ResFloor) super.saveOrUpdate(resFloor);
	}

	public ResFloor load(Long id )
	{
		return (ResFloor) super.get(ResFloor.class , id);
	}

	
	public List<ResFloor> loadAll()
	{
		return (List<ResFloor>) super.loadAll(ResFloor.class);
	}


	public List<ResFloor> loadByNamedQuery(String queryName)
	{
		
		return (List<ResFloor>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResFloor> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResFloor>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResFloor> search( Map<String, Object> criteria )
	{
		return super.search( ResFloor.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResFloor.class);
	}
}
