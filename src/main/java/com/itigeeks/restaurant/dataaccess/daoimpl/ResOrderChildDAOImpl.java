package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderChild;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderChildDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResOrderChildDAOImpl extends AbstractDAO implements ResOrderChildDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResOrderChild resOrderChild) 
	{
		super.delete(resOrderChild);
	}
	
	public ResOrderChild saveOrUpdate(ResOrderChild resOrderChild) 
	{
		return (ResOrderChild) super.saveOrUpdate(resOrderChild);
	}

	public ResOrderChild load(Long id )
	{
		return (ResOrderChild) super.get(ResOrderChild.class , id);
	}

	
	public List<ResOrderChild> loadAll()
	{
		return (List<ResOrderChild>) super.loadAll(ResOrderChild.class);
	}


	public List<ResOrderChild> loadByNamedQuery(String queryName)
	{
		
		return (List<ResOrderChild>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResOrderChild> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResOrderChild>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResOrderChild> search( Map<String, Object> criteria )
	{
		return super.search( ResOrderChild.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResOrderChild.class);
	}
}
