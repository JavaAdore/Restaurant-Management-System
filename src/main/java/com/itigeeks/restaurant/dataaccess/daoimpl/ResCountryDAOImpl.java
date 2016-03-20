package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCountry;
import com.itigeeks.restaurant.dataaccess.dao.ResCountryDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResCountryDAOImpl extends AbstractDAO implements ResCountryDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResCountry resCountry) 
	{
		super.delete(resCountry);
	}
	
	public ResCountry saveOrUpdate(ResCountry resCountry) 
	{
		return (ResCountry) super.saveOrUpdate(resCountry);
	}

	public ResCountry load(Long id )
	{
		return (ResCountry) super.get(ResCountry.class , id);
	}

	
	public List<ResCountry> loadAll()
	{
		return (List<ResCountry>) super.loadAll(ResCountry.class);
	}


	public List<ResCountry> loadByNamedQuery(String queryName)
	{
		
		return (List<ResCountry>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResCountry> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResCountry>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResCountry> search( Map<String, Object> criteria )
	{
		return super.search( ResCountry.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResCountry.class);
	}
}
