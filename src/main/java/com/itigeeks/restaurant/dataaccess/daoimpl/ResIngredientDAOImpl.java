package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResIngredient;
import com.itigeeks.restaurant.dataaccess.dao.ResIngredientDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResIngredientDAOImpl extends AbstractDAO implements ResIngredientDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResIngredient resIngredient) 
	{
		super.delete(resIngredient);
	}
	
	public ResIngredient saveOrUpdate(ResIngredient resIngredient) 
	{
		return (ResIngredient) super.saveOrUpdate(resIngredient);
	}

	public ResIngredient load(Long id )
	{
		return (ResIngredient) super.get(ResIngredient.class , id);
	}

	
	public List<ResIngredient> loadAll()
	{
		return (List<ResIngredient>) super.loadAll(ResIngredient.class);
	}


	public List<ResIngredient> loadByNamedQuery(String queryName)
	{
		
		return (List<ResIngredient>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResIngredient> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResIngredient>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResIngredient> search( Map<String, Object> criteria )
	{
		return super.search( ResIngredient.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResIngredient.class);
	}

	public List<ResIngredient> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResIngredient.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResIngredient> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResIngredient.class , startPage , pageSize);
	}

}
