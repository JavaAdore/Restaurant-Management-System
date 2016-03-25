package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResIngredient;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
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
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResIngredient.class);
	}

	

	public List<ResIngredient> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResIngredient.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResIngredient> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResIngredient> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResIngredient>) super.load(ResIngredient.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResIngredient> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResIngredient> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResIngredient> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResIngredient>) super.load(ResIngredient.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResIngredient.class  , criteria ,conjuncationType) ;
	}
			


	

}
