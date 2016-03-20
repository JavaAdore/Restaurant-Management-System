package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProductIngredient;
import com.itigeeks.restaurant.dataaccess.dao.ResProductIngredientDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResProductIngredientDAOImpl extends AbstractDAO implements ResProductIngredientDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResProductIngredient resProductIngredient) 
	{
		super.delete(resProductIngredient);
	}
	
	public ResProductIngredient saveOrUpdate(ResProductIngredient resProductIngredient) 
	{
		return (ResProductIngredient) super.saveOrUpdate(resProductIngredient);
	}

	public ResProductIngredient load(Long id )
	{
		return (ResProductIngredient) super.get(ResProductIngredient.class , id);
	}

	
	public List<ResProductIngredient> loadAll()
	{
		return (List<ResProductIngredient>) super.loadAll(ResProductIngredient.class);
	}


	public List<ResProductIngredient> loadByNamedQuery(String queryName)
	{
		
		return (List<ResProductIngredient>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResProductIngredient> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResProductIngredient>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResProductIngredient> search( Map<String, Object> criteria )
	{
		return super.search( ResProductIngredient.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResProductIngredient.class);
	}
}
