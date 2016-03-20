package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProductWithWithout;
import com.itigeeks.restaurant.dataaccess.dao.ResProductWithWithoutDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResProductWithWithoutDAOImpl extends AbstractDAO implements ResProductWithWithoutDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResProductWithWithout resProductWithWithout) 
	{
		super.delete(resProductWithWithout);
	}
	
	public ResProductWithWithout saveOrUpdate(ResProductWithWithout resProductWithWithout) 
	{
		return (ResProductWithWithout) super.saveOrUpdate(resProductWithWithout);
	}

	public ResProductWithWithout load(Long id )
	{
		return (ResProductWithWithout) super.get(ResProductWithWithout.class , id);
	}

	
	public List<ResProductWithWithout> loadAll()
	{
		return (List<ResProductWithWithout>) super.loadAll(ResProductWithWithout.class);
	}


	public List<ResProductWithWithout> loadByNamedQuery(String queryName)
	{
		
		return (List<ResProductWithWithout>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResProductWithWithout> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResProductWithWithout>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResProductWithWithout> search( Map<String, Object> criteria )
	{
		return super.search( ResProductWithWithout.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResProductWithWithout.class);
	}
}
